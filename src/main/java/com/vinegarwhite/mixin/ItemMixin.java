package com.vinegarwhite.mixin;

import com.vinegarwhite.tags.MedicineItemTags;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class ItemMixin {

    @Inject(method = "finishUsing", at = @At("RETURN"))
    private void onFinishUsing(ItemStack stack, World world, LivingEntity user, CallbackInfoReturnable<ItemStack> cir) {
        // 判断是否是玩家
        if (user instanceof PlayerEntity player && !world.isClient) {
            // 判断玩家吃完的物品是否是熟鳕鱼或熟鲑鱼
            if (stack.isIn(MedicineItemTags.Raw_List)) {
                // 聊天栏提示
                player.sendMessage(Text.of("为什么要吃生的啊!"), false);
                // 给予玩家反胃效果，持续 10 秒，效果等级为 0（反胃 I）
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0));
            }
        }
    }
}
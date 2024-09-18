package com.vinegarwhite.mixin;

import com.vinegarwhite.Vinegarwhite;
import com.vinegarwhite.item.MedicineItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public class ItemRendererMixin {
    @ModifyVariable(method = "renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IILnet/minecraft/client/render/model/BakedModel;)V",
    at = @At("HEAD"), argsOnly = true)
    public BakedModel usePottedCactusModel(BakedModel model,
                                           ItemStack stack,
                                           ModelTransformationMode renderMode,
                                           boolean leftHanded,
                                           MatrixStack matrices,
                                           VertexConsumerProvider vertexConsumers,
                                           int light,
                                           int overlay
                                           ){
        // 只在GUI中显示2D模型 其余显示3D模型
        boolean bl = renderMode != ModelTransformationMode.GUI;
        if(bl){
            // 检测是否是仙人掌盆栽
            if(stack.isOf(MedicineItems.POTTED_CACTUS)){
                return ((ItemRendererAccessor) this).getModels().getModelManager().getModel(
                        ModelIdentifier.ofInventoryVariant(Identifier.of(Vinegarwhite.MOD_ID, "potted_cactus_3d")));
            }
            if(stack.isOf(MedicineItems.BLOOMING_POTTED_CACTUS)){
                return ((ItemRendererAccessor) this).getModels().getModelManager().getModel(
                        ModelIdentifier.ofInventoryVariant(Identifier.of(Vinegarwhite.MOD_ID, "blooming_potted_cactus_3d")));
            }
        }
        return model;
    }
}

package com.vinegarwhite.util;

import com.vinegarwhite.item.MedicineItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class MedicineLootTableModifier {
    private static final Identifier FISHING = Identifier.ofVanilla("gameplay/fishing/fish");
    private static final Identifier CREEPER = Identifier.ofVanilla("entities/creeper");




    // 本意是想修改战利品表让钓鱼调上模组物品的，但是只会添加新的战利品池，这样会导致钓鱼给两次物品搞了半天都没搞懂怎么改于是放弃
    public static void modifyLootTable() {

        LootTableEvents.MODIFY.register(((key, tableBuilder, source, registries) -> {
            // 钓鱼这么改会导致每个战利品池给一次 不合理
            if(FISHING.equals(key.getValue())) {
                tableBuilder.pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))  // 保持现有池子的规则
                        .with(ItemEntry.builder(Items.DIAMOND))  // 添加新物品，比如钻石
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .build());
            }

            // 判断当前 Loot 表是否为 Creeper 的战利品表
            if(CREEPER.equals(key.getValue())) {
                // 创建一个新的 LootPool（战利品池）构建器，用于定义战利品的掉落
                LootPool.Builder poolBuilder = LootPool.builder()
                        // 战利品池的触发次数
                        .rolls(ConstantLootNumberProvider.create(1))
                        // 掉落概率，这里设置为 1.0f（100% 掉落）
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        // 指定战利品池中要掉落的物品
                        .with(ItemEntry.builder(MedicineItems.GOLDEN_FISH))
                        // 设置掉落物品的数量范围
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)));
                tableBuilder.pool(poolBuilder);
            }
        }));
    }
}

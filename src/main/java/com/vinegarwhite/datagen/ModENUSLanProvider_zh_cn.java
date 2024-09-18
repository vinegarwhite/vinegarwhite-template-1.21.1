package com.vinegarwhite.datagen;

import com.vinegarwhite.block.ModBlocks;
import com.vinegarwhite.item.MedicineItems;
import com.vinegarwhite.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider_zh_cn extends FabricLanguageProvider {
    public ModENUSLanProvider_zh_cn(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.ICE_ETHER, "冰之以太");
        translationBuilder.add(ModItems.RAW_ICE_ETHER, "冰之以太粗矿");
        translationBuilder.add(ModItems.CHEESE, "奶酪");


        translationBuilder.add(ModBlocks.ICE_ETHER_ORE, "冰之以太矿石");
        translationBuilder.add(ModBlocks.RAW_ICE_ETHER_BLOCK, "冰之以太粗矿块");

        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK, "冰之以太块");
        translationBuilder.add(ModBlocks.ICE_ETHER_STAIRS, "冰之以太楼梯");
        translationBuilder.add(ModBlocks.ICE_ETHER_SLAB, "冰之以太台阶");
        translationBuilder.add(ModBlocks.ICE_ETHER_BUTTON, "冰之以太按钮");
        translationBuilder.add(ModBlocks.ICE_ETHER_PRESSURE_PLATE, "冰之以太压力板");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE, "冰之以太栅栏");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE_GATE, "冰之以太栅栏门");
        translationBuilder.add(ModBlocks.ICE_ETHER_WALL, "冰之以太墙");
//        translationBuilder.add(ModBlocks.ICE_ETHER_DOOR, "冰之以太门");
//        translationBuilder.add(ModBlocks.ICE_ETHER_TRAPDOOR, "冰之以太活板门");

        // 护甲
        translationBuilder.add(ModItems.ICE_ETHER_HELMET, "冰之以太头盔");
        translationBuilder.add(ModItems.ICE_ETHER_CHESTPLATE, "冰之以太胸甲");
        translationBuilder.add(ModItems.ICE_ETHER_LEGGINGS, "冰之以太护腿");
        translationBuilder.add(ModItems.ICE_ETHER_BOOTS, "冰之以太靴子");

        translationBuilder.add("itemGroup.vinegarwhite_group", "Vinegarwhite模组");

        // 药绝中文翻译

        // 药物
        translationBuilder.add(MedicineItems.ALPHA_PILL, "α药");
        translationBuilder.add(MedicineItems.BETA_PILL, "β药");
        translationBuilder.add(MedicineItems.GAMMA_PILL, "γ药");
        translationBuilder.add(MedicineItems.DELTA_PILL, "δ药");

        // 食物
        translationBuilder.add(MedicineItems.STRAWBERRY, "草莓");
        translationBuilder.add(MedicineItems.SALAD, "时蔬沙拉");
        translationBuilder.add(MedicineItems.HAMBURGER, "牛肉汉堡");
        translationBuilder.add(MedicineItems.COLA, "罐装可乐");
        translationBuilder.add(MedicineItems.KAISER_ROLL, "凯撒面包");

        // 鱼类
        translationBuilder.add(MedicineItems.GOLDEN_FISH, "§6黄金鱼§r");
        translationBuilder.add(MedicineItems.KING_FISH, "生鱼王");
        translationBuilder.add(MedicineItems.COOKED_KING_FISH, "熟鱼王");
        translationBuilder.add(MedicineItems.STRANGE_VIAL, "神秘液体瓶");

        // 植物
        translationBuilder.add(MedicineItems.POTTED_CACTUS, "仙人掌盆栽");
        translationBuilder.add(MedicineItems.BLOOMING_POTTED_CACTUS, "盛开的仙人掌盆栽");
        translationBuilder.add(MedicineItems.DEAD_POTTED_CACTUS, "死亡的仙人掌盆栽");

        // 头
        translationBuilder.add(MedicineItems.DECAY_HEAD, "Decay的头");

        // 属性
        translationBuilder.add("attribute.name.generic.mental_state", "精神状态");

        // 药水效果
        translationBuilder.add("effect.vinegarwhite.severe_condition", "病情较重");

        // 创造模式物品栏
        translationBuilder.add("itemGroup.medicine_group", "药绝");

        // 描述信息
        translationBuilder.add("item.salad.shift_tooltip", "使用后恢复精神状态，概率提升身体素质和提升食物的恢复效果。可以移除营养不良。");
        translationBuilder.add("item.salad.tooltip", "按下§6SHIFT§r查看具体信息");
    }
}

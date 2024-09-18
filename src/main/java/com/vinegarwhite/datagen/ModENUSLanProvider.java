package com.vinegarwhite.datagen;

import com.vinegarwhite.block.ModBlocks;
import com.vinegarwhite.item.MedicineItems;
import com.vinegarwhite.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.ICE_ETHER, "Ice Ether");
        translationBuilder.add(ModItems.RAW_ICE_ETHER, "Raw Ice Ether");
        translationBuilder.add(ModItems.CHEESE, "Cheese");


        translationBuilder.add(ModBlocks.ICE_ETHER_ORE, "Ice Ether Ore");
        translationBuilder.add(ModBlocks.RAW_ICE_ETHER_BLOCK, "Raw Ice Ether Block");
        translationBuilder.add("itemGroup.vinegarwhite_group", "Vinegarwhite Group");

        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK, "Ice Ether Block");
        translationBuilder.add(ModBlocks.ICE_ETHER_STAIRS, "Ice Ether Stairs");
        translationBuilder.add(ModBlocks.ICE_ETHER_SLAB, "Ice Ether Slab");
        translationBuilder.add(ModBlocks.ICE_ETHER_BUTTON, "Ice Ether Button");
        translationBuilder.add(ModBlocks.ICE_ETHER_PRESSURE_PLATE, "Ice Ether Pressure Plate");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE, "Ice Ether Fence");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE_GATE, "Ice Ether Fence Gate");
        translationBuilder.add(ModBlocks.ICE_ETHER_WALL, "Ice Ether Wall");
//        translationBuilder.add(ModBlocks.ICE_ETHER_DOOR, "Ice Ether Door");
//        translationBuilder.add(ModBlocks.ICE_ETHER_TRAPDOOR, "Ice Ether TRAPDOOR");

        // 护甲
        translationBuilder.add(ModItems.ICE_ETHER_HELMET, "Ice Ether Helmet");
        translationBuilder.add(ModItems.ICE_ETHER_CHESTPLATE, "Ice Ether Chestplate");
        translationBuilder.add(ModItems.ICE_ETHER_LEGGINGS, "Ice Ether Leggings");
        translationBuilder.add(ModItems.ICE_ETHER_BOOTS, "Ice Ether Boots");

        // 药绝英文翻译

        // 药物
        translationBuilder.add(MedicineItems.ALPHA_PILL, "α Pill");
        translationBuilder.add(MedicineItems.BETA_PILL, "β Pill");
        translationBuilder.add(MedicineItems.GAMMA_PILL, "γ Pill");
        translationBuilder.add(MedicineItems.DELTA_PILL, "δ Pill");

        // 食物
        translationBuilder.add(MedicineItems.STRAWBERRY, "Strawberry");
        translationBuilder.add(MedicineItems.SALAD, "Seasonal Vegetable Salad");
        translationBuilder.add(MedicineItems.HAMBURGER, "Beef Burger");
        translationBuilder.add(MedicineItems.COLA, "Cola");
        translationBuilder.add(MedicineItems.KAISER_ROLL, "kaiser Roll");

        // 鱼类
        translationBuilder.add(MedicineItems.GOLDEN_FISH, "§6Golden Fish§r");
        translationBuilder.add(MedicineItems.KING_FISH, "King Fish");
        translationBuilder.add(MedicineItems.COOKED_KING_FISH, "Cooked King Fish");
        translationBuilder.add(MedicineItems.STRANGE_VIAL, "Strange Vial");

        // 植物
        translationBuilder.add(MedicineItems.POTTED_CACTUS, "Potted Cactus");
        translationBuilder.add(MedicineItems.BLOOMING_POTTED_CACTUS, "Blooming Potted Cactus");
        translationBuilder.add(MedicineItems.DEAD_POTTED_CACTUS, "Dead Potted Cactus");

        // 头
        translationBuilder.add(MedicineItems.DECAY_HEAD, "Decay's Head");


        // 创造模式物品栏
        translationBuilder.add("itemGroup.medicine_group", "Medicine");

        // 属性
        translationBuilder.add("attribute.name.generic.mental_state", "Mental State");

        // 描述信息
        translationBuilder.add("item.salad.shift_tooltip", "");
        translationBuilder.add("item.salad.tooltip", "Dietary guidelines recommend a general recommendation of 300-500g of at least 5 types of vegetables per day \nhold §6SHIFT§r for more information");

    }
}

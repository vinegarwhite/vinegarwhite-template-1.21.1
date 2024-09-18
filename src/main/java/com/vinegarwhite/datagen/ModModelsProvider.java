package com.vinegarwhite.datagen;

import com.vinegarwhite.block.ModBlockFamilies;
import com.vinegarwhite.block.ModBlocks;
import com.vinegarwhite.item.MedicineItems;
import com.vinegarwhite.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ArmorItem;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        ModBlockFamilies.getFamilies()
                        .filter(BlockFamily::shouldGenerateModels)
                                .forEach(blockFamily -> blockStateModelGenerator.registerCubeAllModelTexturePool(blockFamily
                                        .getBaseBlock()).family(blockFamily));

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ICE_ETHER_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ICE_ETHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ICE_ETHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_BOOTS);



        // 药绝物品模型

        // 药物
        itemModelGenerator.register(MedicineItems.ALPHA_PILL, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BETA_PILL, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.GAMMA_PILL, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.DELTA_PILL, Models.GENERATED);

        // 食物
        itemModelGenerator.register(MedicineItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SALAD, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.HAMBURGER, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.COLA, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.KAISER_ROLL, Models.GENERATED);

        // 鱼类
        itemModelGenerator.register(MedicineItems.GOLDEN_FISH, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.KING_FISH, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.COOKED_KING_FISH, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.STRANGE_VIAL, Models.GENERATED);

        // 植物
        itemModelGenerator.register(MedicineItems.POTTED_CACTUS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BLOOMING_POTTED_CACTUS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.DEAD_POTTED_CACTUS, Models.GENERATED);
    }
}

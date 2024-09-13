package com.vinegarwhite.datagen;

import com.vinegarwhite.block.ModBlocks;
import com.vinegarwhite.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ICE_ETHER_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ICE_ETHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ICE_ETHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);

        // 药绝物品模型
        itemModelGenerator.register(ModItems.ALPHA_PILL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BETA_PILL, Models.GENERATED);
        itemModelGenerator.register(ModItems.GAMMA_PILL, Models.GENERATED);
        itemModelGenerator.register(ModItems.DELTA_PILL, Models.GENERATED);

    }
}

package com.vinegarwhite.datagen;

import com.vinegarwhite.block.ModBlocks;
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
        translationBuilder.add(ModItems.STRAWBERRY, "草莓");

        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK, "冰之以太块");
        translationBuilder.add(ModBlocks.ICE_ETHER_ORE, "冰之以太矿石");
        translationBuilder.add(ModBlocks.RAW_ICE_ETHER_BLOCK, "冰之以太粗矿块");

        translationBuilder.add("itemGroup.vinegarwhite_group", "Vinegarwhite模组");

        // 药绝中文翻译
        translationBuilder.add(ModItems.ALPHA_PILL, "α药");
        translationBuilder.add(ModItems.BETA_PILL, "β药");
        translationBuilder.add(ModItems.GAMMA_PILL, "γ药");
        translationBuilder.add(ModItems.DELTA_PILL, "δ药");
    }
}

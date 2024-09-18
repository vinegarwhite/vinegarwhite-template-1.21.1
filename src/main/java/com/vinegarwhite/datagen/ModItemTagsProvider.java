package com.vinegarwhite.datagen;

import com.vinegarwhite.item.MedicineItems;
import com.vinegarwhite.item.ModItems;
import com.vinegarwhite.tags.MedicineItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider{
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(MedicineItemTags.Sugar_Tag)
                .add(Items.BEETROOT)
                .add(ModItems.CHEESE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ICE_ETHER_HELMET)
                .add(ModItems.ICE_ETHER_CHESTPLATE)
                .add(ModItems.ICE_ETHER_LEGGINGS)
                .add(ModItems.ICE_ETHER_BOOTS);

        getOrCreateTagBuilder(MedicineItemTags.Raw_List)
                .add(MedicineItems.KING_FISH)
                .add(Items.COD)
                .add(Items.SALMON)
                .add(Items.CHICKEN)
                .add(Items.BEEF)
                .add(Items.PORKCHOP)
                .add(Items.MUTTON)
                .add(Items.RABBIT);
    }
}

package com.vinegarwhite.datagen;

import com.vinegarwhite.Vinegarwhite;
import com.vinegarwhite.block.ModBlocks;
import com.vinegarwhite.item.MedicineItems;
import com.vinegarwhite.item.ModItems;
import com.vinegarwhite.tags.MedicineItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> ICE_ETHER = List.of(ModItems.RAW_ICE_ETHER, Items.ICE);

    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // 九个合成一个
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ICE_ETHER,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_BLOCK);
        // 名为ICE_ETHER的List中的所有物品都可以被烧炼成下面的函数里面的物品
        offerSmelting(exporter, ICE_ETHER, RecipeCategory.MISC, ModItems.ICE_ETHER, 0.7f,
                200, "ice_ether");
        offerBlasting(exporter, ICE_ETHER, RecipeCategory.MISC, ModItems.ICE_ETHER, 0.7f,
                200, "ice_ether");
        // 营火配方
        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, CampfireCookingRecipe::new,
                600, ModItems.RAW_ICE_ETHER, ModItems.ICE_ETHER, 0.35f);

        // 有序合成
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SUGAR, 3)
                .pattern("###")
                .input('#', MedicineItemTags.Sugar_Tag)
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.BEETROOT))
                .offerTo(exporter, Identifier.of(Vinegarwhite.MOD_ID, "beetroot_to_sugar"));
        // 无序合成
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_ORE)
                .input(ModItems.RAW_ICE_ETHER)
                .input(Items.STONE)
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.RAW_ICE_ETHER))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.STONE))
                .offerTo(exporter, Identifier.of(Vinegarwhite.MOD_ID, "ice_ether_ore"));

        // 仙人掌盆栽的合成配方
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, MedicineItems.POTTED_CACTUS)
                // 无序合成所需材料
                .input(Items.CACTUS)
                .input(Blocks.SAND)
                .input(Items.WHITE_DYE)
                .input(Blocks.FLOWER_POT)
                // 拥有仙人掌时解锁配方
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.CACTUS))
                // 合成得到的产物
                .offerTo(exporter, Identifier.of(Vinegarwhite.MOD_ID, "crafting_potted_cactus"));





    }
}

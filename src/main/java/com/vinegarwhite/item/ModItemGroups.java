package com.vinegarwhite.item;

import com.vinegarwhite.Vinegarwhite;
import com.vinegarwhite.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

//    比较复杂地添加创造模式物品栏的方式
//    public static final RegistryKey<ItemGroup> Vinegarwhite_Group = register("vinegarwhite_group");
//
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(Vinegarwhite.MOD_ID,id));
//    }
//    public static void registerModItemGroup() {
//        Registry.register(Registries.ITEM_GROUP, Vinegarwhite_Group,
//                ItemGroup.create(ItemGroup.Row.TOP, 7)
//                        .displayName(Text.translatable("itemGroup.vinegarwhite.vinegarwhite_group"))
//                                .icon(() -> new ItemStack(ModItems.ICE_ETHER))
//                        .entries((displayContext, entries) -> {
//                            entries.add(ModItems.ICE_ETHER);
//                        }).build());
//        Vinegarwhite.LOGGER.info("Registering Item Groups");
//    }

    public static final ItemGroup VINEGARWHITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Vinegarwhite.MOD_ID, "vinegarwhite_group"), ItemGroup.create(null, -1)
                    .displayName(Text.translatable("itemGroup.vinegarwhite_group"))
                    .icon(() -> new ItemStack(ModItems.ICE_ETHER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ICE_ETHER);
                        entries.add(ModItems.RAW_ICE_ETHER);
                        entries.add(ModItems.CHEESE);


                        entries.add(Blocks.BRICKS);
                        entries.add(Items.DIAMOND);

                        entries.add(ModBlocks.ICE_ETHER_BLOCK);
                        entries.add(ModBlocks.ICE_ETHER_ORE);
                        entries.add(ModBlocks.RAW_ICE_ETHER_BLOCK);

                        entries.add(ModBlocks.ICE_ETHER_STAIRS);
                        entries.add(ModBlocks.ICE_ETHER_SLAB);
                        entries.add(ModBlocks.ICE_ETHER_BUTTON);
                        entries.add(ModBlocks.ICE_ETHER_PRESSURE_PLATE);
                        entries.add(ModBlocks.ICE_ETHER_FENCE);
                        entries.add(ModBlocks.ICE_ETHER_FENCE_GATE);
                        entries.add(ModBlocks.ICE_ETHER_WALL);
//                        entries.add(ModBlocks.ICE_ETHER_DOOR);
//                        entries.add(ModBlocks.ICE_ETHER_DOOR);

                        // 护甲
                        entries.add(ModItems.ICE_ETHER_HELMET);
                        entries.add(ModItems.ICE_ETHER_CHESTPLATE);
                        entries.add(ModItems.ICE_ETHER_LEGGINGS);
                        entries.add(ModItems.ICE_ETHER_BOOTS);
                    }).build());

    // 添加药绝创造模式物品栏
    public static final ItemGroup MEDICINE_GROUP = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(Vinegarwhite.MOD_ID, "medicine_group"), ItemGroup.create(null, -1)
                    .displayName(Text.translatable("itemGroup.medicine_group"))
                    .icon(() -> new ItemStack(MedicineItems.ALPHA_PILL)).entries(((displayContext, entries) -> {
                        // 药绝

                        // 药物
                        entries.add(MedicineItems.ALPHA_PILL);
                        entries.add(MedicineItems.BETA_PILL);
                        entries.add(MedicineItems.GAMMA_PILL);
                        entries.add(MedicineItems.DELTA_PILL);

                        // 食物
                        entries.add(MedicineItems.STRAWBERRY);
                        entries.add(MedicineItems.SALAD);
                        entries.add(MedicineItems.HAMBURGER);
                        entries.add(MedicineItems.COLA);
                        entries.add(MedicineItems.KAISER_ROLL);

                        // 植物
                        entries.add(MedicineItems.POTTED_CACTUS);
                        entries.add(MedicineItems.BLOOMING_POTTED_CACTUS);
                        entries.add(MedicineItems.DEAD_POTTED_CACTUS);

                        // 钓鱼
                        entries.add(MedicineItems.GOLDEN_FISH);
                        entries.add(MedicineItems.KING_FISH);
                        entries.add(MedicineItems.COOKED_KING_FISH);
                        entries.add(MedicineItems.STRANGE_VIAL);

                        // 头
                        entries.add(MedicineItems.DECAY_HEAD);
                    })).build());


    public static void registerModItemGroups(){
        Vinegarwhite.LOGGER.info("Registering Item Groups");
    }
}

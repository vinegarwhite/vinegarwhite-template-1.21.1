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
                        entries.add(ModItems.STRAWBERRY);

                        entries.add(Blocks.BRICKS);
                        entries.add(Items.DIAMOND);

                        entries.add(ModBlocks.ICE_ETHER_BLOCK);
                        entries.add(ModBlocks.ICE_ETHER_ORE);
                        entries.add(ModBlocks.RAW_ICE_ETHER_BLOCK);

                        entries.add(ModItems.ALPHA_PILL);
                        entries.add(ModItems.BETA_PILL);
                        entries.add(ModItems.GAMMA_PILL);
                        entries.add(ModItems.DELTA_PILL);

                    }).build());

    public static void registerModItemGroups(){
        Vinegarwhite.LOGGER.info("Registering Item Groups");
    }
}

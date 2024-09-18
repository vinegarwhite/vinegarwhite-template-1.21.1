package com.vinegarwhite.item;

import com.vinegarwhite.Vinegarwhite;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item ICE_ETHER = registerItems("ice_ether", new Item(new Item.Settings()));
    public static final Item RAW_ICE_ETHER = registerItems("raw_ice_ether", new Item(new Item.Settings()));
    public static final Item CHEESE = registerItems("cheese", new Item(new Item.Settings().food(ModFoodComponents.CHEESE)));

    // 护甲
    public static final Item ICE_ETHER_HELMET = registerItems("ice_ether_helmet", new ArmorItem(ModArmorMaterials.ICE_ETHER, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item ICE_ETHER_CHESTPLATE = registerItems("ice_ether_chestplate", new ArmorItem(ModArmorMaterials.ICE_ETHER, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item ICE_ETHER_LEGGINGS = registerItems("ice_ether_leggings", new ArmorItem(ModArmorMaterials.ICE_ETHER, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item ICE_ETHER_BOOTS = registerItems("ice_ether_boots", new ArmorItem(ModArmorMaterials.ICE_ETHER, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));

    private static Item registerItems(String id, Item item){
//        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(Vinegarwhite.MOD_ID,id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(Vinegarwhite.MOD_ID,id), item);
    }

    // 把物品添加到创造模式物品栏
    private static void addItemToItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ICE_ETHER);
    }

    // 初始化
    public static void registerModItems(){
        // 注册时添加到物品栏中的“材料”
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToItemGroup);
        // 加载时输出
        Vinegarwhite.LOGGER.info("Registering Items");
    }
}

package com.vinegarwhite.tags;

import com.vinegarwhite.Vinegarwhite;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class MedicineItemTags {

    // 创建TagList 然后用数据生成添加具体物品
    public static final TagKey<Item> Raw_List = of("raw_list");
    public static final TagKey<Item> Sugar_Tag = of("sugar_tag");

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(Vinegarwhite.MOD_ID, id));
    }

    public static void registerMedicineItemTags() {
        Vinegarwhite.LOGGER.info("Registering Item Tags");
    }
}

package com.vinegarwhite.tags;

import com.vinegarwhite.Vinegarwhite;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class MedicineBlockTags {

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.ofVanilla(id));
    }

    public static void registerMedicineBlockTags() {
        Vinegarwhite.LOGGER.info("Registering Block Tags");
    }
}

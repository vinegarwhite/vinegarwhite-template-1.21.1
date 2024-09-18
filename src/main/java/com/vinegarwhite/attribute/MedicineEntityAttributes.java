package com.vinegarwhite.attribute;

import com.vinegarwhite.Vinegarwhite;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class MedicineEntityAttributes {

    // 精神状态Attribute
    public static final RegistryEntry<EntityAttribute> GENERIC_MENTAL_STATE = register(
            "generic.mental_state", new ClampedEntityAttribute("attribute.name.generic.mental_state",
                    100.0, -10000.0, 10000.0).setTracked(true)
    );

    private static RegistryEntry<EntityAttribute> register(String id, EntityAttribute attribute) {
        return Registry.registerReference(Registries.ATTRIBUTE, Identifier.of(Vinegarwhite.MOD_ID ,id), attribute);
    }
}

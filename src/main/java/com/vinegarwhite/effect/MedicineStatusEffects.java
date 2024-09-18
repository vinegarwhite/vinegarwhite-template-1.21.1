package com.vinegarwhite.effect;

import com.vinegarwhite.Vinegarwhite;
import com.vinegarwhite.effect.effects.SevereCondition;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class MedicineStatusEffects {

    public static final RegistryEntry<StatusEffect> STRENGTH = register("severe_condition",
            new SevereCondition(StatusEffectCategory.HARMFUL, 5797459));



    private static RegistryEntry<StatusEffect> register(String id, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Vinegarwhite.MOD_ID, id), statusEffect);
    }

    public static void registerMedicineStatusEffects(){
        Vinegarwhite.LOGGER.info("Registering Status Effects");
    }
}

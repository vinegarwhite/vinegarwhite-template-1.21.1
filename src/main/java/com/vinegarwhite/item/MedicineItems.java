package com.vinegarwhite.item;

import com.vinegarwhite.Vinegarwhite;
import com.vinegarwhite.item.custom.fishing.Strange_Vial;
import com.vinegarwhite.item.custom.food.Cola;
import com.vinegarwhite.item.custom.food.Salad;
import com.vinegarwhite.item.custom.pills.AlphaPill;
import com.vinegarwhite.item.custom.pills.BetaPill;
import com.vinegarwhite.item.custom.pills.DeltaPill;
import com.vinegarwhite.item.custom.pills.GammaPill;
import com.vinegarwhite.item.custom.plants.BloomingPottedCactus;
import com.vinegarwhite.item.custom.plants.DeadPottedCactus;
import com.vinegarwhite.item.custom.plants.PottedCactus;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MedicineItems {

    // 药物
    public static final Item ALPHA_PILL = registerItems("alpha_pill", new AlphaPill(new Item.Settings().food(MedicineFoodComponents.ALPHA_PILL)));
    public static final Item BETA_PILL = registerItems("beta_pill", new BetaPill(new Item.Settings().food(MedicineFoodComponents.BETA_PILL)));
    public static final Item GAMMA_PILL = registerItems("gamma_pill", new GammaPill(new Item.Settings().food(MedicineFoodComponents.GAMMA_PILL)));
    public static final Item DELTA_PILL = registerItems("delta_pill", new DeltaPill(new Item.Settings().food(MedicineFoodComponents.DELTA_PILL)));

    // 食物
    public static final Item STRAWBERRY = registerItems("strawberry",new Item(new Item.Settings().food(MedicineFoodComponents.STRAWBERRY)));
    public static final Item SALAD = registerItems("salad",new Salad(new Item.Settings().food(MedicineFoodComponents.SALAD)));
    public static final Item HAMBURGER = registerItems("hamburger",new Item(new Item.Settings().food(MedicineFoodComponents.HAMBURGER)));
    public static final Item COLA = registerItems("cola",new Cola(new Item.Settings().food(MedicineFoodComponents.COLA)));
    public static final Item KAISER_ROLL = registerItems("kaiser_roll",new Item(new Item.Settings().food(MedicineFoodComponents.KAISER_ROLL)));

    // 植物
    public static final Item POTTED_CACTUS = registerItems("potted_cactus", new PottedCactus(new Item.Settings()));
    public static final Item BLOOMING_POTTED_CACTUS = registerItems("blooming_potted_cactus", new BloomingPottedCactus(new Item.Settings()));
    public static final Item DEAD_POTTED_CACTUS = registerItems("dead_potted_cactus", new DeadPottedCactus(new Item.Settings()));

    // 钓鱼
    public static final Item GOLDEN_FISH = registerItems("golden_fish",new Item(new Item.Settings().food(MedicineFoodComponents.GOLDEN_FISH)));
    public static final Item KING_FISH = registerItems("king_fish",new Item(new Item.Settings().food(MedicineFoodComponents.KING_FISH)));
    public static final Item COOKED_KING_FISH = registerItems("cooked_king_fish",new Item(new Item.Settings().food(MedicineFoodComponents.COOKED_KING_FISH)));
    public static final Item STRANGE_VIAL = registerItems("strange_vial",new Strange_Vial(new Item.Settings().food(MedicineFoodComponents.STRANGE_VIAL)));

    // 头
    public static final Item DECAY_HEAD = registerItems("decay_head", new Item(new Item.Settings()));

    // 注册物品使用的方法
    public static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Vinegarwhite.MOD_ID,id), item);
    }

    // 外部调用该类中的函数时 初始化静态变量时自动注册物品
    public static void registerModItems(){
        // 加载时输出文本
        Vinegarwhite.LOGGER.info("Registering Medicine Items");
    }

}

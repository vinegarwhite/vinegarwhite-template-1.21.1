package com.vinegarwhite;

import com.vinegarwhite.block.ModBlocks;
import com.vinegarwhite.command.MedicineCommand;
import com.vinegarwhite.effect.MedicineStatusEffects;
import com.vinegarwhite.hud.MedicineHudRenderer;
import com.vinegarwhite.item.MedicineItems;
import com.vinegarwhite.item.ModItemGroups;
import com.vinegarwhite.item.ModItems;
import com.vinegarwhite.tags.MedicineBlockTags;
import com.vinegarwhite.tags.MedicineItemTags;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vinegarwhite implements ModInitializer {
	public static final String MOD_ID = "vinegarwhite";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// 注册物品
		ModItems.registerModItems();
		MedicineItems.registerModItems();
		// 注册方块
		ModBlocks.registerModBlocks();
		// 注册创造模式物品栏
		ModItemGroups.registerModItemGroups();
		// 注册物品Tag
		MedicineItemTags.registerMedicineItemTags();
		// 注册方块Tag
		MedicineBlockTags.registerMedicineBlockTags();
		// 注册命令
		MedicineCommand.register();
		// 注册药水效果
		MedicineStatusEffects.registerMedicineStatusEffects();

		// HUD
		// 注册 HUD 渲染回调，在每次渲染 HUD 时调用 renderCustomValue
		HudRenderCallback.EVENT.register((context, tickDelta) -> MedicineHudRenderer.renderCustomValue(context));
		// 修改钓鱼战利品表
//		MedicineLootTableModifier.modifyLootTable();



		LOGGER.info("Hello Fabric world!");
	}
}
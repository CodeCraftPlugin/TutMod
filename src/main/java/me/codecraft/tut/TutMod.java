package me.codecraft.tut;

import me.codecraft.tut.LootTableModifier.LootTable;
import me.codecraft.tut.block.ModBlock;
import me.codecraft.tut.enchantments.ModEnchantments;
import me.codecraft.tut.item.ModItem;
import me.codecraft.tut.registries.ModRegistries;
import me.codecraft.tut.sounds.ModSounds;
import me.codecraft.tut.util.Commandregister;
import me.codecraft.tut.util.EventRegister;
import me.codecraft.tut.util.Render;
import net.fabricmc.api.ModInitializer;

public class TutMod implements ModInitializer {

	public static final String mod_id = "tut";
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItem.registerModItem();
		ModBlock.registerModBlock();
		ModRegistries.registerModFuel();
		Render.RenderLayer();
		Commandregister.CommandRegister();
		EventRegister.registerEvents();
		LootTable.RegisterLootable();
		ModSounds.registerSounds();
		ModEnchantments.registerModEnchantments();

		System.out.println("Hello Fabric world!");

	}
}

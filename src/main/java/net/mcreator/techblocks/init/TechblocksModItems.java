
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.techblocks.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.techblocks.item.RubisIngoteItem;
import net.mcreator.techblocks.item.PlatineingoteItem;
import net.mcreator.techblocks.item.EpeeeenChrysocoleItem;
import net.mcreator.techblocks.item.DimensioncorrupuItem;
import net.mcreator.techblocks.item.CoeurDeMachineNV1Item;
import net.mcreator.techblocks.item.CoeurCorrupuItem;
import net.mcreator.techblocks.item.ChrysocolleingoteItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TechblocksModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item TECH_BLOCKSPLATINIUME_ORE = register(TechblocksModBlocks.TECH_BLOCKSPLATINIUME_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item PLATINEINGOTE = register(new PlatineingoteItem());
	public static final Item RUBIS_BLOCK = register(TechblocksModBlocks.RUBIS_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item RUBIS_INGOTE = register(new RubisIngoteItem());
	public static final Item DIMENSIONCORRUPU = register(new DimensioncorrupuItem());
	public static final Item COEUR_DE_MACHINE_NV_1 = register(new CoeurDeMachineNV1Item());
	public static final Item CHRYSOCOLLEINGOTE = register(new ChrysocolleingoteItem());
	public static final Item COEUR_CORRUPU = register(new CoeurCorrupuItem());
	public static final Item BLOCDE_CHRYSOCOLLE = register(TechblocksModBlocks.BLOCDE_CHRYSOCOLLE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item EPEEEEN_CHRYSOCOLE = register(new EpeeeenChrysocoleItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}

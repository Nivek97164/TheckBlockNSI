
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.techblocks.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.techblocks.item.SabreLaserItem;
import net.mcreator.techblocks.item.RubisIngoteItem;
import net.mcreator.techblocks.item.PlatineingoteItem;
import net.mcreator.techblocks.item.PistoletLaserItem;
import net.mcreator.techblocks.item.LaserItem;
import net.mcreator.techblocks.item.EpeeeenChrysocoleItem;
import net.mcreator.techblocks.item.DimensioncorrupuItem;
import net.mcreator.techblocks.item.CoeurDeMachineNV1Item;
import net.mcreator.techblocks.item.CoeurCorrupuItem;
import net.mcreator.techblocks.item.ChrysocolleingoteItem;
import net.mcreator.techblocks.item.BatonDeFerItem;
import net.mcreator.techblocks.item.BasDeSabreItem;
import net.mcreator.techblocks.item.ArmuredechrysocolleItem;

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
	public static final Item ARMUREDECHRYSOCOLLE_HELMET = register(new ArmuredechrysocolleItem.Helmet());
	public static final Item ARMUREDECHRYSOCOLLE_CHESTPLATE = register(new ArmuredechrysocolleItem.Chestplate());
	public static final Item ARMUREDECHRYSOCOLLE_LEGGINGS = register(new ArmuredechrysocolleItem.Leggings());
	public static final Item ARMUREDECHRYSOCOLLE_BOOTS = register(new ArmuredechrysocolleItem.Boots());
	public static final Item AIRAIGNER_INFECTER = register(
			new SpawnEggItem(TechblocksModEntities.AIRAIGNER_INFECTER, -3407668, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("airaigner_infecter_spawn_egg"));
	public static final Item AME = register(
			new SpawnEggItem(TechblocksModEntities.AME, -16777216, -10092442, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("ame_spawn_egg"));
	public static final Item GHAST_CORROMPU = register(
			new SpawnEggItem(TechblocksModEntities.GHAST_CORROMPU, -6750055, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("ghast_corrompu_spawn_egg"));
	public static final Item CREEPER_INFECTER = register(
			new SpawnEggItem(TechblocksModEntities.CREEPER_INFECTER, -6750055, -13369549, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("creeper_infecter_spawn_egg"));
	public static final Item BATON_DE_FER = register(new BatonDeFerItem());
	public static final Item SABRE_LASER = register(new SabreLaserItem());
	public static final Item LASER = register(new LaserItem());
	public static final Item PISTOLET_LASER = register(new PistoletLaserItem());
	public static final Item BAS_DE_SABRE = register(new BasDeSabreItem());

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

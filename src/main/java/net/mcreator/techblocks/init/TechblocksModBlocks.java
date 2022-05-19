
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.techblocks.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.techblocks.block.CristalkyberoreBlock;
import net.mcreator.techblocks.block.BlocdeChrysocolleBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TechblocksModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block TECH_BLOCKSPLATINIUME_ORE = register(new TechBlocksplatiniumeOreBlock());
	public static final Block RUBIS_BLOCK = register(new RubisBlockBlock());
	public static final Block DIMENSIONCORRUPU_PORTAL = register(new DimensioncorrupuPortalBlock());
	public static final Block BLOCDE_CHRYSOCOLLE = register(new BlocdeChrysocolleBlock());
	public static final Block CRISTALKYBERORE = register(new CristalkyberoreBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}

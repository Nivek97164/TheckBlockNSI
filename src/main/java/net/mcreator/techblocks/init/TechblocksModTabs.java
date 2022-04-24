
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.techblocks.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TechblocksModTabs {
	public static CreativeModeTab TAB_THECK_BLOCK;

	public static void load() {
		TAB_THECK_BLOCK = new CreativeModeTab("tabtheck_block") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TechblocksModBlocks.TECH_BLOCKSPLATINIUME_ORE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}

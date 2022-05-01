
package net.mcreator.techblocks.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.techblocks.init.TechblocksModTabs;

public class CristalkyberItem extends Item {
	public CristalkyberItem() {
		super(new Item.Properties().tab(TechblocksModTabs.TAB_THECK_BLOCK).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("cristalkyber");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}

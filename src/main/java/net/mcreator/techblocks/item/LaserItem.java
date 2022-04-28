
package net.mcreator.techblocks.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class LaserItem extends Item {
	public LaserItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(64).rarity(Rarity.RARE));
		setRegistryName("laser");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}


package net.mcreator.techblocks.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class RubisIngoteItem extends Item {
	public RubisIngoteItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("rubis_ingote");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}

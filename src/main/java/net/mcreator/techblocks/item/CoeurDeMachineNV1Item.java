
package net.mcreator.techblocks.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.techblocks.init.TechblocksModTabs;

import java.util.List;

public class CoeurDeMachineNV1Item extends Item {
	public CoeurDeMachineNV1Item() {
		super(new Item.Properties().tab(TechblocksModTabs.TAB_THECK_BLOCK).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("coeur_de_machine_nv_1");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("machinecore1"));
	}
}


package net.mcreator.techblocks.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.techblocks.init.TechblocksModTabs;
import net.mcreator.techblocks.init.TechblocksModItems;

public class EpeeeenChrysocoleItem extends SwordItem {
	public EpeeeenChrysocoleItem() {
		super(new Tier() {
			public int getUses() {
				return 1761;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TechblocksModItems.CHRYSOCOLLEINGOTE));
			}
		}, 3, -2.4f, new Item.Properties().tab(TechblocksModTabs.TAB_THECK_BLOCK));
		setRegistryName("epeeeen_chrysocole");
	}
}

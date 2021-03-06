
package net.mcreator.techblocks.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.techblocks.init.TechblocksModTabs;
import net.mcreator.techblocks.init.TechblocksModItems;

public abstract class ArmureenChrysocolleItem extends ArmorItem {
	public ArmureenChrysocolleItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 35;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 7, 9, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 13;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TechblocksModItems.CHRYSOCOLLEINGOTE));
			}

			@Override
			public String getName() {
				return "armureen_chrysocolle";
			}

			@Override
			public float getToughness() {
				return 2.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ArmureenChrysocolleItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(TechblocksModTabs.TAB_THECK_BLOCK));
			setRegistryName("armureen_chrysocolle_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "techblocks:textures/models/armor/texture_armure_chrysocolle__layer_1.png";
		}
	}

	public static class Chestplate extends ArmureenChrysocolleItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(TechblocksModTabs.TAB_THECK_BLOCK));
			setRegistryName("armureen_chrysocolle_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "techblocks:textures/models/armor/texture_armure_chrysocolle__layer_1.png";
		}
	}

	public static class Leggings extends ArmureenChrysocolleItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(TechblocksModTabs.TAB_THECK_BLOCK));
			setRegistryName("armureen_chrysocolle_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "techblocks:textures/models/armor/texture_armure_chrysocolle__layer_2.png";
		}
	}

	public static class Boots extends ArmureenChrysocolleItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(TechblocksModTabs.TAB_THECK_BLOCK));
			setRegistryName("armureen_chrysocolle_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "techblocks:textures/models/armor/texture_armure_chrysocolle__layer_1.png";
		}
	}
}

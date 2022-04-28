
package net.mcreator.techblocks.entity;

import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

import net.mcreator.techblocks.init.TechblocksModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class GhastCorrompuEntityProjectile extends AbstractArrow implements ItemSupplier {
	public GhastCorrompuEntityProjectile(FMLPlayMessages.SpawnEntity packet, Level world) {
		super(TechblocksModEntities.GHAST_CORROMPU_PROJECTILE, world);
	}

	public GhastCorrompuEntityProjectile(EntityType<? extends GhastCorrompuEntityProjectile> type, Level world) {
		super(type, world);
	}

	public GhastCorrompuEntityProjectile(EntityType<? extends GhastCorrompuEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public GhastCorrompuEntityProjectile(EntityType<? extends GhastCorrompuEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.FIRE);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Blocks.FIRE);
	}
}

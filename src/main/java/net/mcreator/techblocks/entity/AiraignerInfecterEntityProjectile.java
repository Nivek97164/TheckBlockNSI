
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
public class AiraignerInfecterEntityProjectile extends AbstractArrow implements ItemSupplier {
	public AiraignerInfecterEntityProjectile(FMLPlayMessages.SpawnEntity packet, Level world) {
		super(TechblocksModEntities.AIRAIGNER_INFECTER_PROJECTILE, world);
	}

	public AiraignerInfecterEntityProjectile(EntityType<? extends AiraignerInfecterEntityProjectile> type, Level world) {
		super(type, world);
	}

	public AiraignerInfecterEntityProjectile(EntityType<? extends AiraignerInfecterEntityProjectile> type, double x, double y, double z,
			Level world) {
		super(type, x, y, z, world);
	}

	public AiraignerInfecterEntityProjectile(EntityType<? extends AiraignerInfecterEntityProjectile> type, LivingEntity entity, Level world) {
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
		return new ItemStack(Blocks.COBWEB);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Blocks.COBWEB);
	}
}

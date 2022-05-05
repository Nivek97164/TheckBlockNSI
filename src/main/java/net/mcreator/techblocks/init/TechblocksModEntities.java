
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.techblocks.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.techblocks.entity.GolemEntity;
import net.mcreator.techblocks.entity.GhastCorrompuEntityProjectile;
import net.mcreator.techblocks.entity.GhastCorrompuEntity;
import net.mcreator.techblocks.entity.CreeperInfecterEntity;
import net.mcreator.techblocks.entity.AmeEntity;
import net.mcreator.techblocks.entity.AiraignerInfecterEntityProjectile;
import net.mcreator.techblocks.entity.AiraignerInfecterEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TechblocksModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<AiraignerInfecterEntity> AIRAIGNER_INFECTER = register("airaigner_infecter",
			EntityType.Builder.<AiraignerInfecterEntity>of(AiraignerInfecterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AiraignerInfecterEntity::new).sized(1.4f, 0.9f));
	public static final EntityType<AiraignerInfecterEntityProjectile> AIRAIGNER_INFECTER_PROJECTILE = register("entitybulletairaigner_infecter",
			EntityType.Builder.<AiraignerInfecterEntityProjectile>of(AiraignerInfecterEntityProjectile::new, MobCategory.MISC)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(AiraignerInfecterEntityProjectile::new).sized(0.5f, 0.5f));
	public static final EntityType<AmeEntity> AME = register("ame",
			EntityType.Builder.<AmeEntity>of(AmeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(AmeEntity::new).fireImmune().sized(0.9f, 1.4f));
	public static final EntityType<GhastCorrompuEntity> GHAST_CORROMPU = register("ghast_corrompu",
			EntityType.Builder.<GhastCorrompuEntity>of(GhastCorrompuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GhastCorrompuEntity::new).fireImmune().sized(2f, 2f));
	public static final EntityType<GhastCorrompuEntityProjectile> GHAST_CORROMPU_PROJECTILE = register("entitybulletghast_corrompu",
			EntityType.Builder.<GhastCorrompuEntityProjectile>of(GhastCorrompuEntityProjectile::new, MobCategory.MISC)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(GhastCorrompuEntityProjectile::new).sized(0.5f, 0.5f));
	public static final EntityType<CreeperInfecterEntity> CREEPER_INFECTER = register("creeper_infecter",
			EntityType.Builder.<CreeperInfecterEntity>of(CreeperInfecterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CreeperInfecterEntity::new).sized(0.6f, 1.7f));
	public static final EntityType<GolemEntity> GOLEM = register("golem",
			EntityType.Builder.<GolemEntity>of(GolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GolemEntity::new).sized(0.6f, 1.9000000000000001f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AiraignerInfecterEntity.init();
			AmeEntity.init();
			GhastCorrompuEntity.init();
			CreeperInfecterEntity.init();
			GolemEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(AIRAIGNER_INFECTER, AiraignerInfecterEntity.createAttributes().build());
		event.put(AME, AmeEntity.createAttributes().build());
		event.put(GHAST_CORROMPU, GhastCorrompuEntity.createAttributes().build());
		event.put(CREEPER_INFECTER, CreeperInfecterEntity.createAttributes().build());
		event.put(GOLEM, GolemEntity.createAttributes().build());
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.techblocks.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.techblocks.client.renderer.GolemRenderer;
import net.mcreator.techblocks.client.renderer.GhastCorrompuRenderer;
import net.mcreator.techblocks.client.renderer.CreeperInfecterRenderer;
import net.mcreator.techblocks.client.renderer.AmeRenderer;
import net.mcreator.techblocks.client.renderer.AiraignerInfecterRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TechblocksModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TechblocksModEntities.AIRAIGNER_INFECTER, AiraignerInfecterRenderer::new);
		event.registerEntityRenderer(TechblocksModEntities.AIRAIGNER_INFECTER_PROJECTILE, ThrownItemRenderer::new);
		event.registerEntityRenderer(TechblocksModEntities.AME, AmeRenderer::new);
		event.registerEntityRenderer(TechblocksModEntities.GHAST_CORROMPU, GhastCorrompuRenderer::new);
		event.registerEntityRenderer(TechblocksModEntities.GHAST_CORROMPU_PROJECTILE, ThrownItemRenderer::new);
		event.registerEntityRenderer(TechblocksModEntities.CREEPER_INFECTER, CreeperInfecterRenderer::new);
		event.registerEntityRenderer(TechblocksModEntities.GOLEM, GolemRenderer::new);
	}
}

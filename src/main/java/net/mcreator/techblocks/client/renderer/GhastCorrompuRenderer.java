package net.mcreator.techblocks.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.GhastModel;

import net.mcreator.techblocks.entity.GhastCorrompuEntity;

public class GhastCorrompuRenderer extends MobRenderer<GhastCorrompuEntity, GhastModel<GhastCorrompuEntity>> {
	public GhastCorrompuRenderer(EntityRendererProvider.Context context) {
		super(context, new GhastModel(context.bakeLayer(ModelLayers.GHAST)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GhastCorrompuEntity entity) {
		return new ResourceLocation("techblocks:textures/end-infected-ghast-on-planetminecraft-com.png");
	}
}

package net.mcreator.techblocks.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.techblocks.entity.CreeperInfecterEntity;

public class CreeperInfecterRenderer extends MobRenderer<CreeperInfecterEntity, CreeperModel<CreeperInfecterEntity>> {
	public CreeperInfecterRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CreeperInfecterEntity entity) {
		return new ResourceLocation("techblocks:textures/tech-corruptet-creeper-ark-extinction-creeper-on-planetminecraft-com.png");
	}
}

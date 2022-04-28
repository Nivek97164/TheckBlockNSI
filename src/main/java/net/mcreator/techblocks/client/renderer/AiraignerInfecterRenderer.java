package net.mcreator.techblocks.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.techblocks.entity.AiraignerInfecterEntity;

public class AiraignerInfecterRenderer extends MobRenderer<AiraignerInfecterEntity, SpiderModel<AiraignerInfecterEntity>> {
	public AiraignerInfecterRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AiraignerInfecterEntity entity) {
		return new ResourceLocation("techblocks:textures/infected-spider-on-planetminecraft-com.png");
	}
}

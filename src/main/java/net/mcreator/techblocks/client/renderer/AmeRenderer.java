package net.mcreator.techblocks.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.techblocks.entity.AmeEntity;

public class AmeRenderer extends MobRenderer<AmeEntity, CowModel<AmeEntity>> {
	public AmeRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AmeEntity entity) {
		return new ResourceLocation("techblocks:textures/mob.png");
	}
}

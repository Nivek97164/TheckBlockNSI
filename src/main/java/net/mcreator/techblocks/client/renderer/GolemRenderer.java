package net.mcreator.techblocks.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.techblocks.entity.GolemEntity;
import net.mcreator.techblocks.client.model.Modelirongolem;

public class GolemRenderer extends MobRenderer<GolemEntity, Modelirongolem<GolemEntity>> {
	public GolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelirongolem(context.bakeLayer(Modelirongolem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GolemEntity entity) {
		return new ResourceLocation("techblocks:textures/war-exoskeleton-bot-for-pillage-camo-on-planetminecraft-com.png");
	}
}

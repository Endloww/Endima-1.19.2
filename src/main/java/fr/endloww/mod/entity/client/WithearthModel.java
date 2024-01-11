package fr.endloww.mod.entity.client;

import fr.endloww.mod.endlowwmod;
import fr.endloww.mod.entity.custom.WithearthEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WithearthModel extends AnimatedGeoModel<WithearthEntity> {
    @Override
    public ResourceLocation getModelResource(WithearthEntity withearthEntity) {
        return new ResourceLocation(endlowwmod.MODID, "geo/withearth.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WithearthEntity withearthEntity) {
        return new ResourceLocation(endlowwmod.MODID, "textures/entity/whithearth_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WithearthEntity withearthEntity) {
        return new ResourceLocation(endlowwmod.MODID, "animations/withearth.json");
    }
}

package fr.endloww.mod.entity;

import fr.endloww.mod.endlowwmod;
import fr.endloww.mod.entity.custom.WithearthEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, endlowwmod.MODID);

    public static final RegistryObject<EntityType<WithearthEntity>> WITHEARTH =
            ENTITY_TYPES.register("withearth",
                    () -> EntityType.Builder.of(WithearthEntity::new, MobCategory.MONSTER)
                            .sized(0.4f,1.5f)
                            .build(new ResourceLocation(endlowwmod.MODID, "withearth").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

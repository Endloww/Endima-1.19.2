package fr.endloww.mod.item;

import fr.endloww.mod.CreativeTabs;
import fr.endloww.mod.endlowwmod;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, endlowwmod.MODID);
    public static final RegistryObject<Item> CHERRIES_ITEM = ITEMS.register("cherries", () -> new Item(new Item.Properties()
            .tab(CreativeTabs.ENDIMA)
            .stacksTo(2).food(new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationMod(4)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 0), 1F)

                    .alwaysEat()
                    .build()
            )
    ));
    public static final RegistryObject<Item> CHERRY_ITEM = ITEMS.register("cherry", () -> new Item(new Item.Properties()
            .tab(CreativeTabs.ENDIMA)
            .stacksTo(2).food(new FoodProperties.Builder()
                    .nutrition(4)
                    .saturationMod(2)
                    .alwaysEat()
                    .build()
            )
    ));

    public static final RegistryObject<Item> ULTIMATE_SWORD = ITEMS.register("ultimate_sword", () -> new SwordItem(ModItemTier.ULTIMATE, 2, 3F, new Item.Properties().tab(CreativeTabs.ENDIMA)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}

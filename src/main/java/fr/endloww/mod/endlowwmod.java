package fr.endloww.mod;

import com.mojang.logging.LogUtils;
import fr.endloww.mod.block.Blocks;
import fr.endloww.mod.item.Items;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod(endlowwmod.MODID)
public class endlowwmod
{
    public static final String MODID = "endlowwmod";
    private static final Logger LOGGER = LogUtils.getLogger();
    public endlowwmod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Items.register(modEventBus);
        Blocks.register(modEventBus);

        LOGGER.info("Mod started successfuly !");
        MinecraftForge.EVENT_BUS.register(this);

    }

}

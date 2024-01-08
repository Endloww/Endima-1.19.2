package fr.endloww.mod.block;

import fr.endloww.mod.CreativeTabs;
import fr.endloww.mod.block.custom.SpruceChair;
import fr.endloww.mod.endlowwmod;
import fr.endloww.mod.item.Items;
import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class Blocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, endlowwmod.MODID);

    public static final  RegistryObject<Block> ORANGE_QUARTZ_BLOCK = registerBlock("orange_quartz",() -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).sound(SoundType.AMETHYST)), CreativeTabs.ENDIMA);
    public static final  RegistryObject<Block> SPRUCE_CHAIR = registerBlock("spruce_chair",() -> new SpruceChair(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOL).noOcclusion().lightLevel(s -> 2)), CreativeTabs.ENDIMA);

    public static final  RegistryObject<Block> PURPIUM_ORE = registerBlock("purpium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(4f).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops(), UniformInt.of(2, 6)), CreativeTabs.ENDIMA);
    public static final  RegistryObject<Block> GRINIUM_ORE = registerBlock("grinium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops(), UniformInt.of(2, 6)), CreativeTabs.ENDIMA);
    public static final  RegistryObject<Block> REDIUM_ORE = registerBlock("redium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops(), UniformInt.of(2, 6)), CreativeTabs.ENDIMA);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}

package fr.endloww.mod;

import fr.endloww.mod.block.Blocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabs {
    public static final CreativeModeTab ENDIMA = new CreativeModeTab("endima") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.ORANGE_QUARTZ_BLOCK.get());
        }
    };
}

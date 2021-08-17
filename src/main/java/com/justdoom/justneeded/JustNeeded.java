package com.justdoom.justneeded;

import com.justdoom.justneeded.init.BlockInit;
import com.justdoom.justneeded.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("justneeded")
public class JustNeeded
{
    public static final String MOD_ID = "justneeded";
    //private static final Logger LOGGER = LogManager.getLogger();

    public JustNeeded() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ItemInit.init();
        BlockInit.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    public static final CreativeModeTab JustNeededTab = new CreativeModeTab("justneededtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.BLUE_WOOL_STAIRS.get());
        }
    };
}
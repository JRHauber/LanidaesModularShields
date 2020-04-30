package com.lanidae.lanidaesmodularshields;

/*command to enable testing
gradlew genIntellijRuns
*/

import com.lanidae.lanidaesmodularshields.util.RegistryHandler;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;


@Mod("lms")
public class LanidaesModularShields
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "lms";

    public LanidaesModularShields() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){

    }

    private void doClientStuff(final FMLClientSetupEvent event){

    }

    public static final ItemGroup TAB = new ItemGroup("lmsTab") {
        @Override
        public ItemStack createIcon() {return new ItemStack(RegistryHandler.FORCE_GEM.get());}
    };

}

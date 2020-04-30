package com.lanidae.lanidaesmodularshields.util;

import com.lanidae.lanidaesmodularshields.LanidaesModularShields;
import com.lanidae.lanidaesmodularshields.blocks.BlockItemBase;
import com.lanidae.lanidaesmodularshields.blocks.ForceGemOreBlock;
import com.lanidae.lanidaesmodularshields.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, LanidaesModularShields.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, LanidaesModularShields.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
        public static final RegistryObject<Item> FORCE_GEM = ITEMS.register("force_gem", ItemBase::new);
        public static final RegistryObject<Item> FORCE_IRON = ITEMS.register("force_iron", ItemBase::new);
        public static final RegistryObject<Item> FORCE_DUST = ITEMS.register("force_dust", ItemBase::new);
    // Blocks
        public static final RegistryObject<Block> FORCE_GEM_ORE_BLOCK = BLOCKS.register("force_gem_ore_block", ForceGemOreBlock::new);
    //Block Items
        public static final RegistryObject<Item> FORCE_GEM_ORE_BLOCK_ITEM = ITEMS.register("force_gem_ore_block", () -> new BlockItemBase(FORCE_GEM_ORE_BLOCK.get()));
    // Entities

}

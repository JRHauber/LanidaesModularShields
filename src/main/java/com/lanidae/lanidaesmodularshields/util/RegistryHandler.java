package com.lanidae.lanidaesmodularshields.util;

import com.lanidae.lanidaesmodularshields.LanidaesModularShields;
import com.lanidae.lanidaesmodularshields.blocks.BlockItemBase;
import com.lanidae.lanidaesmodularshields.blocks.ForceGemBlock;
import com.lanidae.lanidaesmodularshields.blocks.ForceDustOreBlock;
import com.lanidae.lanidaesmodularshields.items.ItemBase;
import com.lanidae.lanidaesmodularshields.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
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
        public static final RegistryObject<Item> FIELD_TUNER = ITEMS.register("field_tuner", ItemBase::new);
    // Blocks
        public static final RegistryObject<Block> FORCE_DUST_ORE_BLOCK = BLOCKS.register("force_dust_ore_block", ForceDustOreBlock::new);
        public static final RegistryObject<Block> FORCE_GEM_BLOCK = BLOCKS.register("force_gem_block", ForceGemBlock::new);
    //Block Items
        public static final RegistryObject<Item> FORCE_DUST_ORE_BLOCK_ITEM = ITEMS.register("force_dust_ore_block", () -> new BlockItemBase(FORCE_DUST_ORE_BLOCK.get()));
        public static final RegistryObject<Item> FORCE_GEM_BLOCK_ITEM = ITEMS.register("force_gem_block", () -> new BlockItemBase(FORCE_GEM_BLOCK.get()));
    // Entities
    //Tools
        public static final RegistryObject<SwordItem> FORCE_SWORD = ITEMS.register("force_sword", () ->
                new SwordItem(ModItemTier.FORCE_GEM, 5, -2.8F, new Item.Properties().group(LanidaesModularShields.TAB))
            );

}

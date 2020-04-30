package com.lanidae.lanidaesmodularshields.items;

import com.lanidae.lanidaesmodularshields.LanidaesModularShields;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(LanidaesModularShields.TAB));
    }
}

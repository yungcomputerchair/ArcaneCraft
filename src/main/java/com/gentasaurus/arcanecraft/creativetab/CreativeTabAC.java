package com.gentasaurus.arcanecraft.creativetab;

import com.gentasaurus.arcanecraft.init.ModItems;
import com.gentasaurus.arcanecraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabAC
{
    public static final CreativeTabs tabArcaneCraft = new CreativeTabs(Reference.modid.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return Items.boat;
        }
    };
}

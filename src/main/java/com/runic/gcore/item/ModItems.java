package com.runic.gcore.item;

/**
 * Created by zanis on 3/13/2017.
 */

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {
    public static ItemBase airhorn;

    public static void init(){
        airhorn = register(new ItemBase("airhorn").setCreativeTab(CreativeTabs.MISC));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);
        if (item instanceof ItemBase) {
            ((ItemBase)item).registerItemModel();
        }

        return item;
    }

}

package com.tayjay.craftingarmies.proxy;

import net.minecraft.item.Item;

/**
 * Created by tayjay on 2016-11-06.
 */
public class ClientProxy extends CommonProxy
{
    @Override
    public void registerItemRenderer(Item item, int meta, String id)
    {
        super.registerItemRenderer(item, meta, id);
    }

    @Override
    public void init()
    {
        super.init();
    }

    @Override
    public void preInit()
    {
        super.preInit();
    }

    @Override
    public void registerKeyBindings()
    {
        super.registerKeyBindings();
    }
}

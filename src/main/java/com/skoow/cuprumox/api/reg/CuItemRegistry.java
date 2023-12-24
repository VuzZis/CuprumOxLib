package com.skoow.cuprumox.api.reg;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.function.Supplier;

public class CuItemRegistry {

    public static ArrayList<RegistryObject<Item>> ITEMS_LIST = new ArrayList<>();
    public static CreativeModeTab.DisplayItemsGenerator TAB = (c, a) -> ITEMS_LIST.forEach(i -> a.accept(i.get()));

    public static RegistryObject<Item> REG(DeferredRegister<Item> reg, String id, Supplier<? extends Item> s) {
        RegistryObject<Item> it = reg.register(id,s);
        ITEMS_LIST.add(it);
        return it;
    }


}

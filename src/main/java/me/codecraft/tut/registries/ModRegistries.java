package me.codecraft.tut.registries;

import me.codecraft.tut.TutMod;
import me.codecraft.tut.item.ModItem;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {


    public static void registerModFuel(){
        System.out.println("The Fuels are ready to burn " + TutMod.mod_id);
        FuelRegistry registry  =FuelRegistry.INSTANCE;
        registry.add(ModItem.PEPPER,30*20);
    }
}

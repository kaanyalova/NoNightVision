package com.github.kaanyalova.no_night_vision;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "nonightvision", useMetadata=true)
public class NoNightVision {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        System.out.println("Dirt: " + Blocks.dirt.getUnlocalizedName());

    }
}

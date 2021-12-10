package me.codecraft.tut.util;

import me.codecraft.tut.event.PLayerEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;

public class EventRegister {
    public static void registerEvents(){
        ServerPlayerEvents.COPY_FROM.register(new PLayerEvents());
    }
}

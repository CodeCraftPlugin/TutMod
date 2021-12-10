package me.codecraft.tut.event;

import me.codecraft.tut.TutMod;
import me.codecraft.tut.interfaceforjava.IEntityDataSaver;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.minecraft.server.network.ServerPlayerEntity;

public class PLayerEvents implements ServerPlayerEvents.CopyFrom{
    @Override
    public void copyFromPlayer(ServerPlayerEntity oldPlayer, ServerPlayerEntity newPlayer, boolean alive) {
        IEntityDataSaver original  = ((IEntityDataSaver)oldPlayer);
        IEntityDataSaver player  = ((IEntityDataSaver) newPlayer);
        player.getPersistentData().putIntArray(TutMod.mod_id+"_homepos",original.getPersistentData().
                getIntArray(TutMod.mod_id+"_homepos"));
    }
}

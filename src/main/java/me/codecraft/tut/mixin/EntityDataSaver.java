package me.codecraft.tut.mixin;

import me.codecraft.tut.interfaceforjava.IEntityDataSaver;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityDataSaver implements IEntityDataSaver {
    private NbtCompound persistentData;

    @Override
    public NbtCompound getPersistentData() {
        if (persistentData == null) {
            this.persistentData= new NbtCompound();
        }
        return persistentData;
    }

    @Inject(method = "writeNbt",at = @At("HEAD"))
    protected void injectWriteMethod(NbtCompound nbt, CallbackInfoReturnable c){
        if (nbt != null) {
            nbt.put("CodeCraftData",persistentData);
        }

    }
    @Inject(method = "readNbt",at = @At("HEAD"))
    protected void injectReadMethod(NbtCompound nbt, CallbackInfo c) {
        if (nbt.contains("CodeCraftData", 10)) {
            persistentData = nbt.getCompound("CodeCraftData");
        }
    }




}

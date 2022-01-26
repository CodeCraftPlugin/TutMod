package me.codecraft.tut.sounds;

import me.codecraft.tut.TutMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static SoundEvent SMALL_EXPLOSION = registerSoundEvent("small_explosion");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(TutMod.mod_id, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerSounds() {
        System.out.println("Registering ModSounds for " + TutMod.mod_id);
    }
}
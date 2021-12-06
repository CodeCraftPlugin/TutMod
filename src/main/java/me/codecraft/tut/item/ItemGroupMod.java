package me.codecraft.tut.item;

import me.codecraft.tut.TutMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroupMod {
    public static final ItemGroup RUBY_MOD = FabricItemGroupBuilder.build(new Identifier(TutMod.mod_id,
            "ruby_mod"),() -> new ItemStack(ModItem.RUBY));
}

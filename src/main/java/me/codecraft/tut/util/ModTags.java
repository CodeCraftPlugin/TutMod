package me.codecraft.tut.util;

import me.codecraft.tut.TutMod;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final Tag<Block> OP_ORES = createTag("op_ores");

        private static Tag<Block> createTag(String name) {
            return TagRegistry.block(new Identifier(TutMod.mod_id,name));

        }
        private static Tag<Block> createCommonTag (String name){return TagRegistry.block(new Identifier("c",name));}

    }
    public static class Items{
        public static final Tag<Item> MY_ITEM = createCommonTag("my_item");
        private static Tag<Item> createTag (String name){return TagRegistry.item(new Identifier(TutMod.mod_id,name));}
        private static Tag<Item> createCommonTag (String name){return TagRegistry.item(new Identifier("c",name));}



    }


}

package me.codecraft.tut.util;


import me.codecraft.tut.block.ModBlock;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class Render {
    public static void RenderLayer(){
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.RUBY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.RUBY_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.PEPPER_PLANT, RenderLayer.getCutout());

    }

}

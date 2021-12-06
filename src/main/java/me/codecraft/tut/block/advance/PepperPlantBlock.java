package me.codecraft.tut.block.advance;

import me.codecraft.tut.item.ModItem;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class PepperPlantBlock extends CropBlock {

    public PepperPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItem.PEPPER_SEED;
    }


    }


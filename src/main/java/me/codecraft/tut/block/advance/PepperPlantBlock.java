package me.codecraft.tut.block.advance;

import me.codecraft.tut.item.ModItem;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;

public class PepperPlantBlock extends CropBlock {

    public static final IntProperty AGE = Properties.AGE_5;


    public PepperPlantBlock(Settings settings) {
        super(settings);


    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItem.PEPPER_SEED;
    }
    @Override
    public int getMaxAge() {
        return 5;
    }


    }


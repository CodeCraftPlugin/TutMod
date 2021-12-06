package me.codecraft.tut.item.advance;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class Finder extends Item {

    public Finder(Settings settings) {
        super(settings);

    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext c) {
        if(c.getWorld().isClient){
            BlockPos bp  =c.getBlockPos();
            PlayerEntity p = Objects.requireNonNull(c.getPlayer());

            boolean foundblock = false;

            for(int i = 0; i<= bp.getY(); i++){
                Block blockbelow = c.getWorld().getBlockState(bp.down(1)).getBlock();
                if (isOpBlock(blockbelow)){
                    outputLoc(blockbelow,bp.add(0,-1,0),p);
                    foundblock  =true;
                    break;
                }
            }
            if (!(foundblock)){
                p.sendMessage(new LiteralText("no op ore found"),false);
            }
        }
        c.getStack().damage(1,c.getPlayer(),playerEntity ->
                playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        return super.useOnBlock(c);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()){
            tooltip.add(new TranslatableText("tooltip.tut.finder"));
        }else {
            tooltip.add(new TranslatableText("tooltip.tut.finder.shift"));
        }



        super.appendTooltip(stack, world, tooltip, context);
    }

    private boolean isOpBlock(Block block){
        return block== Blocks.GOLD_ORE||block== Blocks.IRON_ORE||
                block== Blocks.DEEPSLATE_GOLD_ORE||block== Blocks.DEEPSLATE_IRON_ORE||block== Blocks.DIAMOND_ORE
                ||block== Blocks.DEEPSLATE_DIAMOND_ORE||block== Blocks.COPPER_ORE||block== Blocks.DEEPSLATE_COPPER_ORE;

        }
        private void outputLoc(Block blockFound , BlockPos pos,PlayerEntity p ){
            p.sendMessage(new LiteralText("Found" + blockFound.asItem().getName().getString() + "at ( "
                    + pos.getX() + pos.getY() + pos.getZ()+" )") ,false);
        }

}

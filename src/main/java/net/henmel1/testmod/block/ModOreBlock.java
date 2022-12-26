package net.henmel1.testmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class ModOreBlock extends OreBlock {
    public ModOreBlock(AbstractBlock.Properties p_i48357_1_) {
        super(p_i48357_1_);
    }

    //Overrides xpOnDrop calculations for modded ores
    protected int xpOnDrop(Random p_220281_1_) {
        if (this == ModBlocks.QUANTHRACITE_ORE.get()) {
            return MathHelper.nextInt(p_220281_1_, 3, 7);
        }  else {
            return this == ModBlocks.QUANTHRACITE_ORE.get() ? MathHelper.nextInt(p_220281_1_, 3, 7) : 0;
        }
    }
    //Overrides getExpDrop for modded ores
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.xpOnDrop(RANDOM) : 0;
    }

}

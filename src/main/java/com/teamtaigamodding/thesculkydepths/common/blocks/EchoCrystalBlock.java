package com.teamtaigamodding.thesculkydepths.common.blocks;


import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.state.BlockState;

public class EchoCrystalBlock extends AmethystClusterBlock {

    public EchoCrystalBlock(Properties properties) {
        super(7, 3, properties);
    }


    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader level, RandomSource randomSource, BlockPos pos, int fortuneLevel, int silkTouchLevel) {
        return silkTouchLevel == 0 ? 20 : 0;
    }
}

package com.teamtaigamodding.thesculkydepths.common.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class DirectionalBlockGood extends DirectionalBlock {
    protected DirectionalBlockGood(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState().setValue(FACING, Direction.UP));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public @NotNull BlockState rotate(BlockState stateIn, Rotation rotatedBy) {
        return stateIn.setValue(FACING, rotatedBy.rotate(stateIn.getValue(FACING)));
    }

    public @NotNull BlockState mirror(BlockState stateIn, Mirror mirrorAxis) {
        return stateIn.setValue(FACING, mirrorAxis.mirror(stateIn.getValue(FACING)));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return defaultBlockState().setValue(FACING, context.getClickedFace().getOpposite());
    }
}
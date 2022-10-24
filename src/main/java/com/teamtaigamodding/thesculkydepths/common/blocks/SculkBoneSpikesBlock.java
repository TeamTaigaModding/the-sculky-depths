package com.teamtaigamodding.thesculkydepths.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SculkBoneSpikesBlock extends Block implements SimpleWaterloggedBlock {
//if you try to waterlog a spike it just crashes and im too tired for this crap
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    //as a warning for my future self or anyone else here: DO NOT MAKE THE HITBOX PRIVATE FFS
    public static final VoxelShape SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 11.0D, 13.0D);

    public SculkBoneSpikesBlock(Properties p_49795_) {
        super(p_49795_);
    }

//that moment when parchment doesnt work so you have throw random shit at the wall and hope you can see past the numbers
    public VoxelShape getShape(BlockState p_50952_, BlockGetter p_50953_, BlockPos p_50954_, CollisionContext p_50955_) {
        return SHAPE;
    }

    @Override
    public VoxelShape getInteractionShape(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return Shapes.block();


    }
}

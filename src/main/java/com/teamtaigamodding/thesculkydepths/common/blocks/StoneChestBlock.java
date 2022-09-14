package com.teamtaigamodding.thesculkydepths.common.blocks;

import com.teamtaigamodding.thesculkydepths.common.blocks.entities.StoneChestBlockEntity;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class StoneChestBlock extends ChestBlock {
    public StoneChestBlock(Properties properties) {
        super(properties, TSDBlockEntities.STONE_CHEST::get);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new StoneChestBlockEntity(pos, state);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter Getter, @NotNull BlockPos Pos, @NotNull CollisionContext CollisionContext) {
        return Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    }

}


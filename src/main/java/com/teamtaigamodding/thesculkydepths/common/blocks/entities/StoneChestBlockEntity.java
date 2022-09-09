package com.teamtaigamodding.thesculkydepths.common.blocks.entities;

import com.teamabnormals.blueprint.common.block.entity.BlueprintChestBlockEntity;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class StoneChestBlockEntity extends ChestBlockEntity {

    public StoneChestBlockEntity(BlockPos pos, BlockState state) {
        super(TSDBlockEntities.STONE_CHEST.get(), pos, state);
    }
}

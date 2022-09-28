package com.teamtaigamodding.thesculkydepths.common.blocks.entities;

import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlockEntities;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class StoneChestBlockEntity extends AbstractDiffSoundChestBE {

    public StoneChestBlockEntity(BlockPos pos, BlockState state) {
        super(TSDBlockEntities.STONE_CHEST.get(), pos, state, TSDSoundEvents.STONE_CHEST_OPEN.get(), TSDSoundEvents.STONE_CHEST_OPEN.get());
    }

}

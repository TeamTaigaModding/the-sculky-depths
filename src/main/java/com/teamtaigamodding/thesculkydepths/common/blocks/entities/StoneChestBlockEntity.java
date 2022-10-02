package com.teamtaigamodding.thesculkydepths.common.blocks.entities;

import com.teamabnormals.blueprint.core.endimator.Endimatable;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlockEntities;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class StoneChestBlockEntity extends AbstractDiffSoundChestBE implements Endimatable {

    private EndimatedState endimatedState = new EndimatedState(this);

    public StoneChestBlockEntity(BlockPos pos, BlockState state) {
        super(TSDBlockEntities.STONE_CHEST.get(), pos, state, TSDSoundEvents.STONE_CHEST_OPEN.get(), TSDSoundEvents.STONE_CHEST_OPEN.get());
    }

    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag() {
        return this.saveWithoutMetadata();
    }

    @Override
    public EndimatedState getEndimatedState() {
        return this.endimatedState;
    }

    @Override
    public Position getPos() {
        return Vec3.atCenterOf(this.worldPosition);
    }

    @Override
    public boolean isActive() {
        return !this.isRemoved();
    }

}

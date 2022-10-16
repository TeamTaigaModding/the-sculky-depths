package com.teamtaigamodding.thesculkydepths.common.blocks.entities;

import com.teamabnormals.blueprint.core.endimator.Endimatable;
import com.teamabnormals.blueprint.core.endimator.PlayableEndimation;
import com.teamabnormals.blueprint.core.endimator.PlayableEndimationManager;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlockEntities;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Position;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class StoneChestBlockEntity extends AbstractDiffSoundChestBE implements Endimatable {

    private EndimatedState endimatedState = new EndimatedState(this);

    public StoneChestBlockEntity(BlockPos pos, BlockState state) {
        super(TSDBlockEntities.STONE_CHEST.get(), pos, state, TSDSoundEvents.STONE_CHEST_OPEN.get(), TSDSoundEvents.STONE_CHEST_OPEN.get());
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {

        super.saveAdditional(tag);
        if (!this.trySaveLootTable(tag)) {
            ContainerHelper.saveAllItems(tag, this.getItems());
        }
        tag.putInt("AnimationTick", this.getAnimationTick());
        PlayableEndimation playableEndimation = this.getPlayingEndimation();
        if (playableEndimation != PlayableEndimation.BLANK) {
            ResourceLocation endimation = PlayableEndimationManager.INSTANCE.getKey(this.getPlayingEndimation());
            tag.putString("Endimation", endimation != null ? endimation.toString() : PlayableEndimation.BLANK.location().toString());
        }
    }


    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        this.setItems(NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY));
        if (!this.tryLoadLootTable(tag)) {
            ContainerHelper.loadAllItems(tag, this.getItems());
        }
        if (tag.contains("Endimation", Tag.TAG_STRING)) {
            PlayableEndimation endimation = PlayableEndimationManager.INSTANCE.getEndimation(new ResourceLocation(tag.getString("Endimation")));
            if (endimation == PlayableEndimation.BLANK || endimation == null) {
                this.resetEndimation();
            } else {
                this.setPlayingEndimation(endimation);
                this.setAnimationTick(tag.getInt("AnimationTick"));
            }
        }
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

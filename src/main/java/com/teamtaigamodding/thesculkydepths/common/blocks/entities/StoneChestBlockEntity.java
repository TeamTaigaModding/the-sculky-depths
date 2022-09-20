package com.teamtaigamodding.thesculkydepths.common.blocks.entities;

import com.teamabnormals.blueprint.common.block.entity.BlueprintChestBlockEntity;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlockEntities;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlocks;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.CompoundContainer;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import net.minecraft.world.level.block.entity.EnderChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.ChestType;

public class StoneChestBlockEntity extends ChestBlockEntity {

    public StoneChestBlockEntity(BlockPos pos, BlockState state) {
        super(TSDBlockEntities.STONE_CHEST.get(), pos, state);
    }

}

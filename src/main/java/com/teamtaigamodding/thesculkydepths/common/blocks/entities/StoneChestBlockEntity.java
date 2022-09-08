package com.teamtaigamodding.thesculkydepths.common.blocks.entities;

import com.teamabnormals.blueprint.common.block.entity.BlueprintChestBlockEntity;
import com.teamabnormals.blueprint.core.registry.BlueprintBlockEntityTypes;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class StoneChestBlockEntity extends BlueprintChestBlockEntity {
    protected StoneChestBlockEntity(BlockEntityType<?> typeIn, BlockPos pos, BlockState state) {
        super(typeIn, pos, state);
    }

    public StoneChestBlockEntity(BlockPos pos, BlockState state) {
        super(TSDBlockEntities.STONE_CHEST.get(), pos, state);
    }
}

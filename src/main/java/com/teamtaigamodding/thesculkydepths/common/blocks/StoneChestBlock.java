package com.teamtaigamodding.thesculkydepths.common.blocks;

import com.teamtaigamodding.thesculkydepths.common.blocks.entities.StoneChestBlockEntity;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlockEntities;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDPlayableEndimations;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
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
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return createTickerHelper(type, TSDBlockEntities.STONE_CHEST.get(), (testlevel, pos, testState, test) -> {
            test.endimateTick();
        });
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        }
        else {
            if (level.getBlockEntity(pos) instanceof StoneChestBlockEntity SCBE) {
                SCBE.setPlayingEndimation(TSDPlayableEndimations.STONE_CHEST_OPEN);
                level.sendBlockUpdated(pos, state, state, 3);
            }
            MenuProvider menuprovider = this.getMenuProvider(state, level, pos);
            if (menuprovider != null) {
                player.openMenu(menuprovider);
                player.awardStat(this.getOpenChestStat());
                PiglinAi.angerNearbyPiglins(player, true);
            }

            return InteractionResult.CONSUME;
        }
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter Getter, @NotNull BlockPos Pos, @NotNull CollisionContext CollisionContext) {
        return Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

}


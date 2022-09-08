package com.teamtaigamodding.thesculkydepths.common.blocks;

import com.teamabnormals.blueprint.common.block.chest.BlueprintChestBlock;
import com.teamabnormals.blueprint.common.block.entity.BlueprintChestBlockEntity;
import com.teamtaigamodding.thesculkydepths.common.blocks.entities.StoneChestBlockEntity;
import com.teamtaigamodding.thesculkydepths.common.events.scheduler.OpenChestTask;
import com.teamtaigamodding.thesculkydepths.common.events.scheduler.TSGTickHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.TimeUnit;

public class StoneChestBlock extends BlueprintChestBlock {


    public StoneChestBlock(String type, Properties props) {
        super(type, props);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        }
        else {
            MenuProvider menuprovider = this.getMenuProvider(state, level, pos);
            if (menuprovider != null) {
                PiglinAi.angerNearbyPiglins(player, true);
                if (((LivingEntity) player).getEffect(MobEffects.DAMAGE_BOOST) != null) {
                    player.openMenu(menuprovider);

                }
                else {
                    TSGTickHandler.scheduleAsyncTask(new OpenChestTask(player, menuprovider), 4, TimeUnit.SECONDS);
                }
            }

            return InteractionResult.CONSUME;
        }
    }
}


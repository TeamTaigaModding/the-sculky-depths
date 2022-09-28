package com.teamtaigamodding.thesculkydepths.common.blocks.entities;

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
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.ChestType;

public abstract class AbstractDiffSoundChestBE extends ChestBlockEntity {
    SoundEvent open;
    SoundEvent close;
    protected AbstractDiffSoundChestBE(BlockEntityType<?> type, BlockPos pos, BlockState state, SoundEvent open, SoundEvent close) {
        super(type, pos, state);
        this.open = open;
        this.close = close;
    }


    private final ContainerOpenersCounter customOpenersCounter = new ContainerOpenersCounter() {
        protected void onOpen(Level p_155357_, BlockPos p_155358_, BlockState p_155359_) {
            AbstractDiffSoundChestBE.playSound(p_155357_, p_155358_, p_155359_, open);
        }

        protected void onClose(Level level, BlockPos pos, BlockState state) {
            AbstractDiffSoundChestBE.playSound(level, pos, state, close);
        }

        protected void openerCountChanged(Level level, BlockPos pos, BlockState p_155363_, int p_155364_, int p_155365_) {
            AbstractDiffSoundChestBE.this.signalOpenCount(level, pos, p_155363_, p_155364_, p_155365_);
        }

        protected boolean isOwnContainer(Player player) {
            if (!(player.containerMenu instanceof ChestMenu)) {
                return false;
            } else {
                Container container = ((ChestMenu)player.containerMenu).getContainer();
                return container == AbstractDiffSoundChestBE.this || container instanceof CompoundContainer && ((CompoundContainer)container).contains(AbstractDiffSoundChestBE.this);
            }
        }
    };

    public void stopOpen(Player p_59118_) {
        if (!this.remove && !p_59118_.isSpectator()) {
            this.customOpenersCounter.decrementOpeners(p_59118_, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    static void playSound(Level p_155339_, BlockPos p_155340_, BlockState p_155341_, SoundEvent p_155342_) {
        ChestType chesttype = p_155341_.getValue(ChestBlock.TYPE);
        if (chesttype != ChestType.LEFT) {
            double d0 = (double)p_155340_.getX() + 0.5D;
            double d1 = (double)p_155340_.getY() + 0.5D;
            double d2 = (double)p_155340_.getZ() + 0.5D;
            if (chesttype == ChestType.RIGHT) {
                Direction direction = ChestBlock.getConnectedDirection(p_155341_);
                d0 += (double)direction.getStepX() * 0.5D;
                d2 += (double)direction.getStepZ() * 0.5D;
            }

            p_155339_.playSound((Player)null, d0, d1, d2, p_155342_, SoundSource.BLOCKS, 0.5F, p_155339_.random.nextFloat() * 0.1F + 0.9F);
        }
    }
    @Override
    public void startOpen(Player p_59120_) {
        if (!this.remove && !p_59120_.isSpectator()) {
            this.customOpenersCounter.incrementOpeners(p_59120_, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    @Override
    public void recheckOpen() {
        if (!this.remove) {
            this.customOpenersCounter.recheckOpeners(this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }
}

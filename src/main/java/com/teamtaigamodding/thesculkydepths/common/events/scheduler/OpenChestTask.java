package com.teamtaigamodding.thesculkydepths.common.events.scheduler;

import com.teamtaigamodding.thesculkydepths.common.blocks.entities.StoneChestBlockEntity;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;

public class OpenChestTask implements Runnable{
    private final Player player;
    private final MenuProvider menuProvider;

    public OpenChestTask(Player player, MenuProvider menuProvider) {
        this.player = player;
        this.menuProvider = menuProvider;
    }

    @Override
    public void run() {
        player.swing(InteractionHand.MAIN_HAND);
        player.openMenu(menuProvider);
    }
}

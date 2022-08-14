package com.teamtaigamodding.thesculkydepths.common.events;

import com.teamtaigamodding.thesculkydepths.TheSculkyDepths;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TheSculkyDepths.MOD_ID)
public class TSGEvents {
    @SubscribeEvent
    public static void PlaceEchoShard(PlayerInteractEvent.RightClickBlock event) {
        Player player = event.getEntity();
        ItemStack usedItem = event.getItemStack();
        InteractionHand hand = event.getHand();
        if (usedItem.is(Items.ECHO_SHARD)) {
            BlockPlaceContext context = new BlockPlaceContext(player, hand, new ItemStack(TSDBlocks.ECHO_SHARD_BLOCK.get().asItem()), event.getHitVec());
            InteractionResult result = TSDBlocks.ECHO_SHARD_BLOCK.get().asItem().useOn(context);
            if (player.isCreative()) usedItem.shrink(1);
            event.setCanceled(true);
            event.setCancellationResult(result);
        }
    }




}

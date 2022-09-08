package com.teamtaigamodding.thesculkydepths.common.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.SlotAccess;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ClickAction;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class DeadRingerItem extends Item {

    public DeadRingerItem(Properties properties) {
        super(properties);
    }


    @Override
    public boolean overrideOtherStackedOnMe(ItemStack DRItem, ItemStack clickItem, Slot slot, ClickAction clickAction, Player player, SlotAccess slotAccess) {
        if (clickAction == ClickAction.SECONDARY && slot.allowModification(player)) {
            if (clickItem.is(Items.AMETHYST_SHARD)) {
                clickItem.shrink(1);
                this.ReleaseStoredXp();
            }
            return true;
        }
        return false;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        return super.use(level, player, hand);
    }

    public void ReleaseStoredXp() {

    }
}

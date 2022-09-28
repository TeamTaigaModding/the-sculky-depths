package com.teamtaigamodding.thesculkydepths.common.items;

import com.teamabnormals.blueprint.common.item.InjectedItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class SculkMulchItem extends Item {
    public SculkMulchItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity LE) {
        ItemStack itemstack = super.finishUsingItem(stack, level, LE);
        if (LE instanceof Player player) {

        }
        return LE instanceof Player && ((Player) LE).getAbilities().instabuild ? itemstack : new ItemStack(Items.BOWL);
    }
}

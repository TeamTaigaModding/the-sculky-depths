package com.teamtaigamodding.thesculkydepths.data.builder;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public record DeadRingerConverter(LivingEntity input, float xp, boolean isWither, LivingEntity output) {


}

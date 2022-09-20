package com.teamtaigamodding.thesculkydepths.other;

import com.teamtaigamodding.thesculkydepths.common.registry.TSDSoundEvents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;

public class TSDSoundTypes {
    public static final SoundType ECHO_CRYSTAL = new SoundType(1.0F, 1.0F, TSDSoundEvents.ECHO_CRYSTAL_BREAK.get(), SoundEvents.SCULK_SENSOR_STEP, TSDSoundEvents.ECHO_CRYSTAL_PLACE.get(), SoundEvents.SCULK_SENSOR_BREAK, SoundEvents.SCULK_SENSOR_STEP);
}

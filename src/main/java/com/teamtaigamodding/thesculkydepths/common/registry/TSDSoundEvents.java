package com.teamtaigamodding.thesculkydepths.common.registry;

import com.teamtaigamodding.thesculkydepths.TheSculkyDepths;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TSDSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TheSculkyDepths.MOD_ID);

    public static final RegistryObject<SoundEvent> STONE_CHEST_LOCKED = SOUNDS.register("block.stone_chest.locked",
            () -> new SoundEvent(new ResourceLocation(TheSculkyDepths.MOD_ID, "block.stone_chest.locked")));
    public static final RegistryObject<SoundEvent> STONE_CHEST_OPEN = SOUNDS.register("block.stone_chest.open",
            () -> new SoundEvent(new ResourceLocation(TheSculkyDepths.MOD_ID, "block.stone_chest.open")));
}

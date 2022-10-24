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

    public static final RegistryObject<SoundEvent> STONE_CHEST_CLOSE = SOUNDS.register("block.stone_chest.close",
            () -> new SoundEvent(new ResourceLocation(TheSculkyDepths.MOD_ID, "block.stone_chest.close")));
    public static final RegistryObject<SoundEvent> ECHO_CRYSTAL_PLACE = SOUNDS.register("block.echo_crystal.place",
            () -> new SoundEvent(new ResourceLocation(TheSculkyDepths.MOD_ID, "block.echo_crystal.place")));
    public static final RegistryObject<SoundEvent> ECHO_CRYSTAL_BREAK = SOUNDS.register("block.echo_crystal.break",
            () -> new SoundEvent(new ResourceLocation(TheSculkyDepths.MOD_ID, "block.echo_crystal.break")));


    public static final RegistryObject<SoundEvent> DEAD_RINGER_CHARGE = SOUNDS.register("item.dead_ringer.charge",
            () -> new SoundEvent(new ResourceLocation(TheSculkyDepths.MOD_ID, "item.dead_ringer.charge")));
    public static final RegistryObject<SoundEvent> DEAD_RINGER_RELEASE = SOUNDS.register("item.dead_ringer.release",
            () -> new SoundEvent(new ResourceLocation(TheSculkyDepths.MOD_ID, "item.dead_ringer.release")));

    public static final RegistryObject<SoundEvent> BEHEMOTH_EMERGE = SOUNDS.register("entity.behemoth.emerge",
            () -> new SoundEvent(new ResourceLocation(TheSculkyDepths.MOD_ID, "entity.behemoth.emerge")));

    public static final RegistryObject<SoundEvent> BEHEMOTH_HEARTBEAT = SOUNDS.register("entity.behemoth.heartbeat",
            () -> new SoundEvent(new ResourceLocation(TheSculkyDepths.MOD_ID, "entity.behemoth.heartbeat")));
}

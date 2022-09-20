package com.teamtaigamodding.thesculkydepths.common.blocks;

import com.teamtaigamodding.thesculkydepths.common.registry.TSDSoundEvents;
import com.teamtaigamodding.thesculkydepths.other.TSDSoundTypes;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class TSDBlockProps {
    public static final BlockBehaviour.Properties ECHO_CRYSTAL = BlockBehaviour.Properties.of(Material.SCULK, MaterialColor.COLOR_CYAN).strength(1F).sound(TSDSoundTypes.ECHO_CRYSTAL);
    public static final BlockBehaviour.Properties DEEPSLATE_LANTERN = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.5F).lightLevel(state -> 10).sound(SoundType.DEEPSLATE_BRICKS);
    public static final BlockBehaviour.Properties SCULK_BONE_BLOCK = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(2F).sound(SoundType.BONE_BLOCK);
    public static final BlockBehaviour.Properties CARVED_SCULK_BONE_BLOCK = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(2F).sound(SoundType.BONE_BLOCK);
    public static final BlockBehaviour.Properties STONE_CHEST = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(5F).sound(SoundType.DEEPSLATE_BRICKS).noOcclusion();
    public static final BlockBehaviour.Properties SCULK_SPINE = BlockBehaviour.Properties.of(Material.SCULK, MaterialColor.COLOR_BLACK).strength(0.4F).sound(SoundType.SCULK);
    public static final BlockBehaviour.Properties BROKEN_JUKEBOX = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).strength(2.0F, 6.0F).sound(SoundType.STONE);

}

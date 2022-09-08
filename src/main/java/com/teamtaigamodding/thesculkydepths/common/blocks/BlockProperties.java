package com.teamtaigamodding.thesculkydepths.common.blocks;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlockProperties {
    public static final BlockBehaviour.Properties ECHO_CRYSTAL = BlockBehaviour.Properties.of(Material.SCULK, MaterialColor.COLOR_CYAN).strength(1F).sound(SoundType.SCULK_SENSOR);
    public static final BlockBehaviour.Properties DEEPSLATE_LANTERN = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.5F).requiresCorrectToolForDrops().
            lightLevel(state -> 10).sound(SoundType.DEEPSLATE_BRICKS);

    public static final BlockBehaviour.Properties STONE_CHEST = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(5F).sound(SoundType.DEEPSLATE_BRICKS);

}

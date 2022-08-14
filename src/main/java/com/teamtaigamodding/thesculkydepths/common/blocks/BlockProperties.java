package com.teamtaigamodding.thesculkydepths.common.blocks;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlockProperties {
    public static final BlockBehaviour.Properties ECHO_SHARD_BLOCK = BlockBehaviour.Properties.of(Material.SCULK, MaterialColor.COLOR_CYAN).strength(0.6F).sound(SoundType.SCULK_SENSOR);

}

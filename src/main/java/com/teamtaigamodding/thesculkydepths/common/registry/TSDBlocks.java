package com.teamtaigamodding.thesculkydepths.common.registry;

import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import com.teamtaigamodding.thesculkydepths.TheSculkyDepths;
import com.teamtaigamodding.thesculkydepths.common.blocks.BlockProperties;
import com.teamtaigamodding.thesculkydepths.common.blocks.EchoShardBlock;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
@Mod.EventBusSubscriber(modid = TheSculkyDepths.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TSDBlocks {
    public static final BlockSubRegistryHelper HELPER = TheSculkyDepths.REGISTRY_HELPER.getBlockSubHelper();
    public static final RegistryObject<Block> ECHO_SHARD_BLOCK = HELPER.createBlock("echo_shard_block", () -> new EchoShardBlock(BlockProperties.ECHO_SHARD_BLOCK), CreativeModeTab.TAB_MISC);
}

package com.teamtaigamodding.thesculkydepths.common.registry;

import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import com.teamtaigamodding.thesculkydepths.TheSculkyDepths;
import com.teamtaigamodding.thesculkydepths.common.blocks.BlockProperties;
import com.teamtaigamodding.thesculkydepths.common.blocks.EchoCrystalBlock;
import com.teamtaigamodding.thesculkydepths.common.blocks.StoneChestBlock;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = TheSculkyDepths.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TSDBlocks {
    public static final BlockSubRegistryHelper HELPER = TheSculkyDepths.REGISTRY_HELPER.getBlockSubHelper();

    public static final RegistryObject<Block> ECHO_CRYSTAL = HELPER.createBlock("echo_crystal", () -> new EchoCrystalBlock(BlockProperties.ECHO_CRYSTAL), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STONE_CHEST = HELPER.createBlock("stone_chest", () -> new StoneChestBlock("stone", BlockProperties.STONE_CHEST), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> DEEPSLATE_LANTERN = HELPER.createBlock("deepslate_lantern", () -> new Block(BlockProperties.DEEPSLATE_LANTERN), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SCULK_BONE_BLOCK = HELPER.createBlock("sculk_bone_block", () -> new RotatedPillarBlock(BlockProperties.SCULK_BONE_BLOCK), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CARVED_SCULK_BONE_BLOCK = HELPER.createBlock("carved_sculk_bone_block", () -> new RotatedPillarBlock(BlockProperties.CARVED_SCULK_BONE_BLOCK), CreativeModeTab.TAB_BUILDING_BLOCKS);
}

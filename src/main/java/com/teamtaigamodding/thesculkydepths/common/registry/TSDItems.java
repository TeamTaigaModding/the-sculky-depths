package com.teamtaigamodding.thesculkydepths.common.registry;

import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import com.teamtaigamodding.thesculkydepths.TheSculkyDepths;
import com.teamtaigamodding.thesculkydepths.common.blocks.BlockProperties;
import com.teamtaigamodding.thesculkydepths.common.blocks.EchoCrystalBlock;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = TheSculkyDepths.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TSDItems {
    public static final ItemSubRegistryHelper HELPER = TheSculkyDepths.REGISTRY_HELPER.getItemSubHelper();
//Leaving this up to dolt to figure out
    public static final RegistryObject<Item> ECHOLOCATOR = HELPER.createItem("echolocator", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
}

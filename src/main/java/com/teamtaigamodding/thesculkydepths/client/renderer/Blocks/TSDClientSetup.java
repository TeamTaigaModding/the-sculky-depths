package com.teamtaigamodding.thesculkydepths.client.renderer.Blocks;

import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class TSDClientSetup {
    public static void setup(final FMLClientSetupEvent EVENT) {
        ItemBlockRenderTypes.setRenderLayer(TSDBlocks.ECHO_CRYSTAL.get(), RenderType.cutout());
    }
}
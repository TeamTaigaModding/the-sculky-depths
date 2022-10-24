package com.teamtaigamodding.thesculkydepths.client.Events;

import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class TSDClientSetup {
    public static void setup(final FMLClientSetupEvent EVENT) {
        ItemBlockRenderTypes.setRenderLayer(TSDBlocks.ECHO_CRYSTAL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TSDBlocks.SCULK_BONE_SPIKES.get(), RenderType.cutout());
    }
}
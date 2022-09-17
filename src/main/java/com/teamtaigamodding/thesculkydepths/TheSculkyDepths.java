package com.teamtaigamodding.thesculkydepths;

import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import com.teamtaigamodding.thesculkydepths.client.Events.TSDClientSetup;
import com.teamtaigamodding.thesculkydepths.client.models.blocks.StoneChestModel;
import com.teamtaigamodding.thesculkydepths.client.renderer.Blocks.StoneChestRenderer;
import com.teamtaigamodding.thesculkydepths.common.events.TSGEvents;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlockEntities;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TheSculkyDepths.MOD_ID)
public class TheSculkyDepths {
    public static final String MOD_ID = "the_sculky_depths";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);
    public TheSculkyDepths() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        REGISTRY_HELPER.register(bus);


        bus.addListener(this::eventSetup);
        bus.addListener(this::registerLayerDefinitions);
        bus.addListener(this::rendererSetup);
        bus.addListener(TSDClientSetup::setup);
        bus.addListener(this::rendererSetup);

    }
    private void eventSetup(final FMLLoadCompleteEvent event) {
        MinecraftForge.EVENT_BUS.register(new TSGEvents());
    }
    private void rendererSetup(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(TSDBlockEntities.STONE_CHEST.get(), StoneChestRenderer::new);

    }

    private void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(StoneChestModel.LAYER_LOCATION, StoneChestModel::createBodyLayer);
    }
}

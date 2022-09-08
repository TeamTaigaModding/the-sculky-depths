package com.teamtaigamodding.thesculkydepths;

import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import com.teamtaigamodding.thesculkydepths.common.events.TSGEvents;
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

    }
    private void eventSetup(final FMLLoadCompleteEvent event) {
        MinecraftForge.EVENT_BUS.register(new TSGEvents());

    }
}

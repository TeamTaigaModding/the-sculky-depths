package com.teamtaigamodding.thesculkydepths.common.registry;

import com.teamabnormals.blueprint.core.endimator.PlayableEndimation;
import com.teamabnormals.blueprint.core.endimator.PlayableEndimationManager;
import com.teamtaigamodding.thesculkydepths.TheSculkyDepths;
import net.minecraft.resources.ResourceLocation;

public class TSDPlayableEndimations {
    public static final PlayableEndimation STONE_CHEST_CLOSE = register("stone_chests/close", 2, PlayableEndimation.LoopType.NONE);
    public static final PlayableEndimation STONE_CHEST_CLOSE2 = register("stone_chests/close2", 2, PlayableEndimation.LoopType.NONE);
    public static final PlayableEndimation STONE_CHEST_LOCKED = register("stone_chests/locked", 2, PlayableEndimation.LoopType.NONE);
    public static final PlayableEndimation STONE_CHEST_OPEN = register("stone_chests/open", 2, PlayableEndimation.LoopType.NONE);
    public static final PlayableEndimation STONE_CHEST_OPEN2 = register("stone_chests/open", 2, PlayableEndimation.LoopType.NONE);
    private static PlayableEndimation register(String name, int duration, PlayableEndimation.LoopType loopType) {
        return PlayableEndimationManager.INSTANCE.registerPlayableEndimation(new PlayableEndimation(new ResourceLocation(TheSculkyDepths.MOD_ID, name), duration, loopType));
    }
}



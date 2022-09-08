package com.teamtaigamodding.thesculkydepths.common.registry;


import com.teamabnormals.blueprint.common.block.chest.BlueprintChestBlock;
import com.teamabnormals.blueprint.common.block.entity.BlueprintChestBlockEntity;
import com.teamabnormals.blueprint.core.Blueprint;
import com.teamabnormals.blueprint.core.util.registry.BlockEntitySubRegistryHelper;
import com.teamtaigamodding.thesculkydepths.TheSculkyDepths;
import com.teamtaigamodding.thesculkydepths.common.blocks.StoneChestBlock;
import com.teamtaigamodding.thesculkydepths.common.blocks.entities.StoneChestBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = TheSculkyDepths.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TSDBlockEntities {
    public static final BlockEntitySubRegistryHelper HELPER = Blueprint.REGISTRY_HELPER.getBlockEntitySubHelper();

    public static final RegistryObject<BlockEntityType<StoneChestBlockEntity>> STONE_CHEST = HELPER.createBlockEntity("stone_chest", StoneChestBlockEntity::new, StoneChestBlock.class);

}

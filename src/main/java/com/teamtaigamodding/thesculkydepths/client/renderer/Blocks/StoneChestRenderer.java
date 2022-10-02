package com.teamtaigamodding.thesculkydepths.client.renderer.Blocks;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import com.teamabnormals.blueprint.core.endimator.Endimation;
import com.teamabnormals.blueprint.core.endimator.Endimator;
import com.teamtaigamodding.thesculkydepths.TheSculkyDepths;
import com.teamtaigamodding.thesculkydepths.client.models.blocks.StoneChestModel;
import com.teamtaigamodding.thesculkydepths.common.blocks.StoneChestBlock;
import com.teamtaigamodding.thesculkydepths.common.blocks.entities.StoneChestBlockEntity;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlocks;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.state.BlockState;


public class StoneChestRenderer implements BlockEntityRenderer<StoneChestBlockEntity> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(TheSculkyDepths.MOD_ID, "textures/entity/chest/stone/normal.png");
    private static final RenderType RENDER_TYPE = RenderType.entityCutoutNoCull(TEXTURE);
    private StoneChestModel ChestModel;
    private Endimator endimator;
    private final ModelPart root;


    // Make sure to listen for layer locations in the main mod file
    public StoneChestRenderer(BlockEntityRendererProvider.Context context) {
        this.ChestModel = new StoneChestModel(context.bakeLayer(StoneChestModel.LAYER_LOCATION));
        this.endimator = Endimator.compile(this.root = this.ChestModel.createBodyLayer().bakeRoot());
    }

    @Override
    public void render(StoneChestBlockEntity tile, float partialTicks, PoseStack matrixStack, MultiBufferSource buffer, int combinedLight, int combinedOverlay) {
        Endimation endimation = tile.getPlayingEndimation().asEndimation();
        assert endimation != null;
        float time = (tile.getAnimationTick() + partialTicks) * 0.05F;
        float length = endimation.getLength();
        if (time > length) {
            time = length;
        }
        this.endimator.apply(endimation, time, Endimator.ResetMode.ALL);
        tile.getEffectHandler().update(endimation, time);

        matrixStack.pushPose();
        matrixStack.translate(0.5D, 1.5D, 0.5D);
        matrixStack.scale(1.0F, -1.0F, -1.0F);

        BlockState blockstate = tile.getLevel() != null ? tile.getBlockState() : TSDBlocks.STONE_CHEST.get().defaultBlockState().setValue(StoneChestBlock.FACING, Direction.SOUTH);
        float rot = blockstate.getValue(ChestBlock.FACING).toYRot();
        matrixStack.mulPose(Vector3f.YP.rotationDegrees(rot));

        this.ChestModel.render(matrixStack, buffer.getBuffer(RENDER_TYPE), combinedLight, combinedOverlay);
        matrixStack.popPose();

    }
}

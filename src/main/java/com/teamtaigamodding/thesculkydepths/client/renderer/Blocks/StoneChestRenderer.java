package com.teamtaigamodding.thesculkydepths.client.renderer.Blocks;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.teamtaigamodding.thesculkydepths.TheSculkyDepths;
import com.teamtaigamodding.thesculkydepths.client.models.blocks.StoneChestModel;
import com.teamtaigamodding.thesculkydepths.common.blocks.entities.StoneChestBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class StoneChestRenderer implements BlockEntityRenderer<StoneChestBlockEntity> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(TheSculkyDepths.MOD_ID, "textures/entity/chest/stone/normal.png");

    private StoneChestModel ChestModel;

    public StoneChestRenderer(BlockEntityRendererProvider.Context context) {
        this.ChestModel = new StoneChestModel(context.bakeLayer(StoneChestModel.LAYER_LOCATION));
    }

    @Override
    public void render(StoneChestBlockEntity tile, float partialTicks, PoseStack matrixStack, MultiBufferSource bufferIn, int combinedLightIn, int combinedOverlayIn) {
        matrixStack.pushPose();
        matrixStack.translate(0.5D, 1.5D, 0.5D);
        matrixStack.scale(1.0F, -1.0F, -1.0F);

        VertexConsumer ivertexbuilder = bufferIn.getBuffer(RenderType.entityCutoutNoCull(TEXTURE));

        matrixStack.popPose();
    }
}

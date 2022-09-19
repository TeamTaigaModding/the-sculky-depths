package com.teamtaigamodding.thesculkydepths.client.renderer.Blocks;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import com.teamtaigamodding.thesculkydepths.TheSculkyDepths;
import com.teamtaigamodding.thesculkydepths.client.models.blocks.StoneChestModel;
import com.teamtaigamodding.thesculkydepths.common.blocks.StoneChestBlock;
import com.teamtaigamodding.thesculkydepths.common.blocks.entities.StoneChestBlockEntity;
import com.teamtaigamodding.thesculkydepths.common.registry.TSDBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.state.BlockState;


public class StoneChestRenderer implements BlockEntityRenderer<StoneChestBlockEntity> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(TheSculkyDepths.MOD_ID, "textures/entity/chest/stone/normal.png");

    private StoneChestModel ChestModel;

    // Make sure to listen for layer locations in the main mod file
    public StoneChestRenderer(BlockEntityRendererProvider.Context context) {
        this.ChestModel = new StoneChestModel(context.bakeLayer(StoneChestModel.LAYER_LOCATION));
    }

    @Override
    public void render(StoneChestBlockEntity tile, float partialTicks, PoseStack matrixStack, MultiBufferSource bufferIn, int combinedLight, int combinedOverlay) {
        // Make the chest in the cube
        matrixStack.pushPose();
        matrixStack.translate(0.5D, 1.5D, 0.5D);
        matrixStack.scale(1.0F, -1.0F, -1.0F);

        // idk what this is just copy + paste it lol
        VertexConsumer ivertexbuilder = bufferIn.getBuffer(RenderType.entityCutoutNoCull(TEXTURE));

        // determine light level to render block at
        int lightAbove = LevelRenderer.getLightColor(Minecraft.getInstance().level, tile.getBlockPos().above());


        // Make the chest face different ways
        BlockState blockstate = tile.getLevel() != null ? tile.getBlockState() : TSDBlocks.STONE_CHEST.get().defaultBlockState().setValue(StoneChestBlock.FACING, Direction.SOUTH);
        float rot = blockstate.getValue(ChestBlock.FACING).toYRot();
        matrixStack.mulPose(Vector3f.YP.rotationDegrees(-rot));

        // Actual render code
        this.ChestModel.render(matrixStack, ivertexbuilder, combinedLight, combinedOverlay);

        matrixStack.popPose();
    }
}

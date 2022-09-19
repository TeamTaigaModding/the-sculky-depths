package com.teamtaigamodding.thesculkydepths.client.models.blocks;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.teamabnormals.blueprint.client.ClientInfo;
import com.teamtaigamodding.thesculkydepths.TheSculkyDepths;
import com.teamtaigamodding.thesculkydepths.common.blocks.entities.StoneChestBlockEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
// Made with Blockbench 4.3.1

public class StoneChestModel {
    private static final RenderType RENDER_TYPE = RenderType.entityCutoutNoCull(new ResourceLocation(TheSculkyDepths.MOD_ID, "textures/entity/chest/stone/normal.png"));


    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(TheSculkyDepths.MOD_ID, "stone_chest"), "main");
    private final ModelPart Lid;
    private final ModelPart Base;

    public StoneChestModel(ModelPart root) {

        this.Lid = root.getChild("Lid");
        this.Base = root.getChild("Base");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Lid = partdefinition.addOrReplaceChild("Lid", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -3.0F, -8.0F, 16.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, 0.0F));

        PartDefinition Base = partdefinition.addOrReplaceChild("Base", CubeListBuilder.create().texOffs(0, 22).addBox(-8.0F, -5.0F, -8.0F, 16.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
    public void render(PoseStack matrix, VertexConsumer builder, int light, int overlay) {
        this.Lid.render(matrix, builder, light, overlay);
        this.Base.render(matrix, builder, light, overlay);
    }

}
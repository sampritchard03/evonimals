package com.evonimals.entity.renderer;

import com.evonimals.entity.CubeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel> {

    public CubeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CubeEntityModel(context.getPart(EntityTestingClient.MODEL_CUBE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(CubeEntity entity) {
        return Identifier.of("entitytesting", "textures/entity/cube/cube.png");
    }
}

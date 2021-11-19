@java.lang.Override
public net.minecraft.client.renderer.block.model.IBakedModel bake(net.minecraftforge.common.model.IModelState state, net.minecraft.client.renderer.vertex.VertexFormat format, com.google.common.base.Function<net.minecraft.util.ResourceLocation, net.minecraft.client.renderer.texture.TextureAtlasSprite> bakedTextureGetter) {
    return new com.primetoxinz.stacksonstacks.render.RenderIngot(format);
}
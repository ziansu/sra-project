private static void registerEntityRender(java.lang.Class<? extends net.minecraft.entity.Entity> entityClass, net.minecraft.client.renderer.entity.Render render) {
    net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler(entityClass, new net.tropicraft.registry.RenderRegistry.RenderWrapper(render));
}
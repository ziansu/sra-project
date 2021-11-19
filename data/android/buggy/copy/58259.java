@java.lang.Override
public net.minecraft.client.renderer.entity.Render<? super ckhbox.villagebox.common.entity.villager.EntityVillager> createRenderFor(net.minecraft.client.renderer.entity.RenderManager manager) {
    java.lang.System.out.println("get renderer");
    return new ckhbox.villagebox.client.renderer.villager.RenderVillager(manager);
}
@java.lang.Override
public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent e) {
    super.init(e);
    io.github.zaphodious.essentialsorcery.client.render.block.BlockRenderRegister.registerBlockRenderer();
    io.github.zaphodious.essentialsorcery.client.render.item.ItemRenderRegister.registerItemRenderer();
    io.github.zaphodious.essentialsorcery.client.render.entity.EntityRenderRegister.renderEntities();
}
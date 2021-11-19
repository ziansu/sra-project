@java.lang.Override
public void init() {
    super.init();
    erogenousbeef.bigreactors.client.renderer.RendererFuelRod renderer = new erogenousbeef.bigreactors.client.renderer.RendererFuelRod();
    cpw.mods.fml.client.registry.ClientRegistry.bindTileEntitySpecialRenderer(erogenousbeef.bigreactors.common.tileentity.TileEntityFuelRod.class, renderer);
    cpw.mods.fml.common.registry.TickRegistry.registerTickHandler(new erogenousbeef.core.multiblock.MultiblockTickHandler(), Side.CLIENT);
}
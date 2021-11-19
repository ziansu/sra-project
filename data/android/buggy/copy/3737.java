public void init() {
    com.DragonFerocity.expanded.handlers.BlockHandler.registerItems();
    com.DragonFerocity.expanded.proxy.ClientProxy.registerTileEntitySpecialRenderer(com.DragonFerocity.expanded.entities.ModTileEntityChest.class);
}
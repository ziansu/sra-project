public static final boolean addToWhiteList(net.minecraft.item.Item i, int meta) {
    return yuuto.inventorytools.api.toolbox.ToolBoxRegistry.addToBlackList(new yuuto.inventorytools.api.toolbox.ItemData(i, meta));
}
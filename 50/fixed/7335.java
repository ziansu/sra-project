@java.lang.Override
public void preInit() {
    net.minecraftforge.fml.common.registry.GameRegistry.registerBlock(this, org.squiddev.cctweaks.items.ItemMultiBlock.class, name);
    registerTileEntity(org.squiddev.cctweaks.blocks.network.TileNetworkedWirelessBridge.class, "wirelessBridge");
    registerTileEntity(org.squiddev.cctweaks.blocks.network.TileNetworkedModem.class, "wiredModem");
}
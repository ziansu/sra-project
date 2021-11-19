@java.lang.Override
public void onChunkLoad() {
    super.onChunkLoad();
    redstonePowered = (redstoneReactive) && (world().isBlockIndirectlyGettingPowered(x(), y(), z()));
    refreshConnections();
}
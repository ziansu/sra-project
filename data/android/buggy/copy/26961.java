public void removeCableSegment(net.minecraft.util.math.BlockPos pos) {
    mcjty.xnet.multiblock.ChunkBlob blob = getOrCreateBlob(pos);
    if (blob.removeCableSegment(pos)) {
        recalculateNetwork();
    }else {
        blob.fixNetworkAllocations();
    }
}
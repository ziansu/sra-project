public void removeCableSegment(net.minecraft.util.math.BlockPos pos) {
    mcjty.xnet.multiblock.ChunkBlob blob = getOrCreateBlob(pos);
    blob.removeCableSegment(pos);
    recalculateNetwork();
}
private void initOpState(com.gemstone.gemfire.internal.cache.DiskEntry entry, java.nio.ByteBuffer value, byte userBits) {
    this.opState.initialize(entry, value, userBits);
}
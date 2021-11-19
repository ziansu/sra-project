private void initOpState(com.gemstone.gemfire.internal.cache.DiskEntry entry, java.nio.ByteBuffer value, int valueLength, byte userBits) {
    this.opState.initialize(entry, value, valueLength, userBits);
}
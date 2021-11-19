public void skipAll() {
    if ((limit) > (byteBuffer.capacity())) {
        throw new org.terracotta.runnel.utils.BufferLimitReachedException();
    }
    byteBuffer.position(limit);
}
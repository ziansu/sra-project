@java.lang.Override
public void free() {
    if (free) {
        throw new java.lang.RuntimeException("Buffer already freed, free point: ", freePoint);
    }
    freePoint = new java.lang.RuntimeException("FREE POINT");
    free = true;
    io.undertow.testutils.DebuggingSlicePool.BUFFERS.remove(this);
    delegate.free();
}
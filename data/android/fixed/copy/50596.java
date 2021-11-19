private synchronized void freeBuffer() {
    if ((mBuffer) != null) {
        mBuffer = org.mozilla.gecko.mozglue.DirectBufferAllocator.free(mBuffer);
    }
}
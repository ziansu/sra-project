@com.google.common.annotations.VisibleForTesting
static void close(java.io.Closeable closeable) {
    try {
        closeable.close();
    } catch (java.io.IOException e) {
        throw new java.lang.IllegalStateException("failed to close object", e);
    }
}
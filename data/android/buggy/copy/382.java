@java.lang.Override
public void close() throws java.lang.Exception {
    try {
        pool.clear(java.lang.Thread.currentThread());
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Unable to close analyzer for current thread.", e);
    }
}
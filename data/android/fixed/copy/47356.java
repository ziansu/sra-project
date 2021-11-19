public void flush() {
    com.google.cloud.bigtable.grpc.async.AsyncExecutor.LOG.trace("Flushing");
    try {
        sizeManager.flush();
    } catch (java.lang.InterruptedException e) {
        java.lang.Thread.currentThread().interrupt();
    }
    com.google.cloud.bigtable.grpc.async.AsyncExecutor.LOG.trace("Done flushing");
}
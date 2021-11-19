@java.lang.Override
protected void finalize() throws java.lang.Throwable {
    if ((!(preventGC)) && ((executor) != null)) {
        logger.debug("Strategy object is garbage-collected, stopping watcher thread");
        executor.shutdownNow();
    }
    super.finalize();
}
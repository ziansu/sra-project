public void shutdownPool() {
    synchronized(poolLock) {
        executor.shutdown();
        executor = null;
    }
}
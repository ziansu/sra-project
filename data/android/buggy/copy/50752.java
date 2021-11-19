public void removeShutdownLatch(final java.util.concurrent.CountDownLatch latch, final boolean doNotRelease) {
    synchronized(this) {
        if (!doNotRelease) {
            games.strategy.util.CountDownLatchHandler.releaseLatch(latch);
        }
        latchesToCloseOnShutdown.remove(latch);
    }
}
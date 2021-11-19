public boolean pusher(final java.lang.String itemToQueue, int timeout, java.util.concurrent.TimeUnit period) {
    try {
        return com.karlmutch.QueueBasedStack.sProducerQueue.offer(itemToQueue, timeout, period);
    } catch (java.lang.InterruptedException ignoredException) {
        java.lang.Thread.interrupted();
    }
    return false;
}
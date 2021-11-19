@java.lang.Override
public synchronized void onFailure(final java.lang.Throwable t) {
    be.appfoundry.promtius.ParallelPushAggregator.PusherAggregatorTaskCallback.LOGGER.debug("Push failure received", t);
    (failureCount)++;
    markDelegateWhenFinished();
}
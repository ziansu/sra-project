@java.lang.Override
public void reset() {
    cancelStopRefreshingRunnable();
    mSwipeRefreshLayout.reset();
    detachSwipeRefreshLayoutIfNecessary();
}
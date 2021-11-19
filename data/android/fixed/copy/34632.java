public long getVsyncPeriodInMillis() {
    return (mVSyncMonitor.getVSyncPeriodInMicroseconds()) / 1000;
}
protected boolean isInSyncInterval(long syncInterval, long lastSync) {
    long timeNow = java.lang.System.currentTimeMillis();
    return (timeNow - lastSync) < syncInterval;
}
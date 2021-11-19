@javax.annotation.PostConstruct
protected void init() {
    supervisionManager.addConnectionListener(this);
    supervisionManager.addHeartbeatListener(this);
    cacheReadLock = controller.getReadLock();
    historyCache = controller.getHistoryCache();
    liveCache = controller.getLiveCache();
}
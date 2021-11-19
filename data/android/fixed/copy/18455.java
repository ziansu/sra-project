@javax.annotation.PostConstruct
protected void init() {
    cacheReadLock = controller.getReadLock();
    historyCache = controller.getHistoryCache();
    liveCache = controller.getLiveCache();
    supervisionManager.addConnectionListener(this);
    supervisionManager.addHeartbeatListener(this);
}
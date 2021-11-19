protected void stopDConnect() {
    sendTerminateEvent();
    mPluginMgr.setEventListener(null);
    mRequestManager.shutdown();
    hideNotification();
}
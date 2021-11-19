private void registerListeners() {
    this.eventManager.registerEventHandler(new org.centauri.cloud.cloud.listener.CentauriCloudCommandListener());
    this.eventManager.registerEventHandler(new org.centauri.cloud.cloud.listener.TestListener());
}
public void markPauseStateLocally(boolean isBackgroundPaused, boolean isPaused) {
    com.vmware.photon.controller.cloudstore.SystemConfig.instance.isBackgroundPaused = isBackgroundPaused;
    com.vmware.photon.controller.cloudstore.SystemConfig.instance.isPaused = isPaused;
    com.vmware.photon.controller.cloudstore.SystemConfig.logger.info("SystemConfig mark local... isBackgroundPaused:{}  isPaused{}", isBackgroundPaused, isPaused);
}
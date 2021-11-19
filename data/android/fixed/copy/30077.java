public void markPauseStateLocally(boolean isBackgroundPaused, boolean isPaused) {
    this.isBackgroundPaused = isBackgroundPaused;
    this.isPaused = isPaused;
    com.vmware.photon.controller.cloudstore.SystemConfig.logger.info("SystemConfig mark local... isBackgroundPaused:{}  isPaused{}", isBackgroundPaused, isPaused);
}
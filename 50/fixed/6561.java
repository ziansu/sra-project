public void startRecording() {
    log.info("Start recording");
    scaledDistanceFilter = config.getDistanceFilter();
    setPace(true);
}
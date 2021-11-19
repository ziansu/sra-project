public org.ftcteam5206.subsystems.vision.VisionCallback detectBeacon() {
    currentProcessingMode = org.ftcteam5206.subsystems.vision.VisionSystem.ProcessingMode.BEACON;
    org.ftcteam5206.subsystems.vision.VisionSystem.lastFrameRequestedTime = java.lang.System.currentTimeMillis();
    org.ftcteam5206.subsystems.vision.VisionCallback visionCallback = new org.ftcteam5206.subsystems.vision.VisionCallback();
    this.visionCallback = visionCallback;
    return visionCallback;
}
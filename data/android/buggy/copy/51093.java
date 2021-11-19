private java.util.prefs.Preferences getCalibrationNode() {
    return java.util.prefs.Preferences.userNodeForPackage(org.micromanager.projector.ProjectorPlugin.class).node("calibration").node(dev_.getChannel()).node(core_.getCameraDevice());
}
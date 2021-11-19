public void cancelRequested(org.xxxmathxxx.tddt.gui.scenes.Editor ed) {
    org.xxxmathxxx.tddt.logging.TDDTLogManager.getInstance().logMessage("Switching to Test Stage");
    tracker.stageGreen.stopTimeTracking();
    tracker.stageRed.startTimeTracking();
    state = org.xxxmathxxx.tddt.data.CodeStage.TEST;
}
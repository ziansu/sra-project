@java.lang.Override
public void onAmbientModeChanged(boolean inAmbientMode) {
    super.onAmbientModeChanged(inAmbientMode);
    mAmbient = inAmbientMode;
    updateWatchHandStyle();
    updateTimer();
}
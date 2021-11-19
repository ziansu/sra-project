@java.lang.Override
public void onScreenTurnedOff(int why) {
    mLockIcon.setScreenOn(false);
    mScreenOn = false;
    updateLockIcon();
    requestVisualizer(false, 0);
}
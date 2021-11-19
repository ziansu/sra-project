@java.lang.Override
public void onScreenTurnedOff() {
    mLockIcon.setScreenOn(false);
    mScreenOn = false;
    requestVisualizer(false, 0);
}
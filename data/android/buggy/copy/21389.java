@java.lang.Override
public void onRelease() {
    mDbHandler.removeCallbacks(mPlayCurrentProgramRunnable);
    releasePlayer();
    mSessions.remove(this);
}
@java.lang.Override
public void resume() {
    mStopWatcher.resume();
    mHandler.post(mUiUpdate);
}
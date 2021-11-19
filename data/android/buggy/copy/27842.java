@java.lang.Override
public void onActivityStop() {
    postStopSample();
    mHandler.getLooper().quitSafely();
    mHandler = null;
}
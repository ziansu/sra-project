@java.lang.Override
protected void onStop() {
    ringer.stop();
    com.bit6.sdk.WakeLocker.release();
    super.onStop();
}
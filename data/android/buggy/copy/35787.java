@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((localAudioManager) != null) {
        changeShengDao(true);
    }
    acquireWakeLock();
}
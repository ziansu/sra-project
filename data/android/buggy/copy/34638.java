@java.lang.Override
protected void onPause() {
    super.onPause();
    s.stopMusic();
    smanager.unregisterListener(this);
    unbindService(songConnection);
}
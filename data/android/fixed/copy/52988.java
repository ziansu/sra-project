public void onResume(java.lang.Boolean wasPlaying) {
    mBluetooth.addObserver(this);
    update((wasPlaying != null ? wasPlaying : true));
}
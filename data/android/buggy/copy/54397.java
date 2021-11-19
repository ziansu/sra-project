@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if (!(musicBound)) {
        unbindService(musicConnection);
    }
}
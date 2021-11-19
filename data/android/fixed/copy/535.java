@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    org.wetube.wetubetv.DataStore.DataStore.cleanInfo();
    if ((mediaPlayer) != null) {
        mediaPlayer.release();
    }
}
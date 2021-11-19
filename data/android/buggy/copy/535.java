@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mediaPlayer.release();
    org.wetube.wetubetv.DataStore.DataStore.cleanInfo();
}
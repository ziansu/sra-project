@java.lang.Override
protected void onDestroy() {
    if ((photoListAdapter) != null) {
        unbindService(conn);
    }
    super.onDestroy();
}
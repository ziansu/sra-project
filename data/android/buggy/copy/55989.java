@java.lang.Override
protected void onStop() {
    if ((photoListAdapter) != null) {
        android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);
    }
    super.onStop();
}
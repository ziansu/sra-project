@java.lang.Override
protected void onPause() {
    super.onPause();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(downloadReceiver);
}
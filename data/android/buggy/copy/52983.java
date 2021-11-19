@java.lang.Override
protected void onStop() {
    android.util.Log.d("Jane", "unregister Receiver");
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);
    super.onStop();
}
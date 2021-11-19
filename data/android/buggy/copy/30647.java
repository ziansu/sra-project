@java.lang.Override
protected void onStop() {
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(msgReceiver);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(infoReceiver);
    super.onStop();
}
@java.lang.Override
protected void onDestroy() {
    this.unregisterReceiver(hRemoval);
    this.unregisterReceiver(NBR);
    android.util.Log.wtf("Bye Bye now", "");
    notificationManager.cancel(notificationID);
    super.onDestroy();
}
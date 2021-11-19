@java.lang.Override
protected void onDestroy() {
    this.unregisterReceiver(hRemoval);
    this.unregisterReceiver(NBR);
    notificationManager.cancel(notificationID);
    super.onDestroy();
}
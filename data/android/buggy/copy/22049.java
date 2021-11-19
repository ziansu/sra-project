@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    this.lastNotifMillis = intent.getLongExtra("lastRunElapsedRealtime", 0);
    rescheduleNotifications();
}
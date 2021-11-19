private void removeNotification() {
    android.app.NotificationManager nMgr = ((android.app.NotificationManager) (getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE)));
    nMgr.cancel(Constants.NOTIFICATION_ID.FOREGROUND_SERVICE);
}
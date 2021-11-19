@java.lang.Override
public void onTaskRemoved(android.content.Intent rootIntent) {
    super.onTaskRemoved(rootIntent);
    if ((mNotificationManager) != null) {
        mNotificationManager.cancel(NOTIFICATION_ID);
    }
    sharedPreferences.edit().clear().commit();
}
@java.lang.Override
public void onTaskRemoved(com.cntt.freemusicdownloadnow.player.Intent rootIntent) {
    super.onTaskRemoved(rootIntent);
    if ((mNotificationManager) != null) {
        mNotificationManager.cancel(NOTIFICATION_ID);
    }
    sharedPreferences.edit().clear().commit();
}
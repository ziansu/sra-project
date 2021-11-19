@java.lang.Override
public void onDestroy() {
    mMediaNotificationManager.stopNotification();
    mMediaSession.release();
}
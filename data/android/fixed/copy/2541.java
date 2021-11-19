@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    connectGoogleApiClient();
    return START_STICKY;
}
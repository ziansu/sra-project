@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.content.Intent realIntent = intent.getParcelableExtra("_VA_|_intent_");
    if (realIntent != null) {
        startService(realIntent);
    }
    stopSelf();
    return START_NOT_STICKY;
}
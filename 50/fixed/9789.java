@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (android.support.compat.BuildConfig.DEBUG)
        android.util.Log.d(iso.piotrowski.marek.nyndro.RemainderService.RemainderService.TAG, "onStartCommand: [service] start");
    
    doRemind();
    return START_NOT_STICKY;
}
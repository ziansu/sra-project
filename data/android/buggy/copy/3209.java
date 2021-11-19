@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (intent == null) {
        dev.ukanth.ufirewall.log.Log.i(dev.ukanth.ufirewall.log.LogService.TAG, "Restarting LogService");
        startLogService(true);
    }
    return android.app.Service.START_STICKY;
}
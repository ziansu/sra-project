@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (intent != null) {
        if (intent.hasExtra(com.example.polygon_monitor.ServicesMessageDefiningService.MESSAGE)) {
            handleJson(intent.getStringExtra(com.example.polygon_monitor.ServicesMessageDefiningService.MESSAGE));
        }
    }
    return START_STICKY;
}
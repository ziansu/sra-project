@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if ((intent != null) && (intent.getBooleanExtra(com.darshancomputing.BatteryIndicatorPro.BatteryInfoService.EXTRA_UPDATE_PREDICTOR, false)))
        update(null);
    
    return android.app.Service.START_STICKY;
}
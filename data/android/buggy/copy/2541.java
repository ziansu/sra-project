@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    connectGoogleApiClient();
    com.taibah.busservice.utils.DriverService.driverLocationReportingServiceIsRunning = true;
    new com.taibah.busservice.utils.UpdateRouteStatus(getApplicationContext()).execute("status=1");
    return START_STICKY;
}
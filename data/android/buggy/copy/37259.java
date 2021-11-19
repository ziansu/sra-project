public void stopService() {
    android.util.Log.d(com.github.pires.obd.reader.io.MockObdGatewayService.TAG, "Stopping service..");
    notificationManager.cancel(com.github.pires.obd.reader.io.NOTIFICATION_ID);
    jobsQueue.clear();
    isRunning = false;
    stopSelf();
}
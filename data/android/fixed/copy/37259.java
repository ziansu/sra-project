public void stopService() {
    android.util.Log.d(com.github.pires.obd.reader.io.MockObdGatewayService.TAG, "Stopping service..");
    jobsQueue.clear();
    isRunning = false;
    stopSelf();
}
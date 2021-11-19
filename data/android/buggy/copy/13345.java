@java.lang.Override
public void onDestroy() {
    unregisterReceiver(stopInfoReceiver);
    unregisterReceiver(mBatInfoReceiver);
    mSensorManager.unregisterListener(this);
    wakeLock.release();
    stopForeground(true);
    stopScanRssi();
}
@java.lang.Override
public void onDestroy() {
    unregisterReceiver(stopInfoReceiver);
    unregisterReceiver(mBatInfoReceiver);
    mSensorManager.unregisterListener(this);
    wakeLock.release();
    stopScanRssi();
    stopForeground(true);
}
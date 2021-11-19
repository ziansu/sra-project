@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.ozzyboshi.internetbeattimewatchface.InternetBeatTimeWatchFaceService.TAG, "Destroy engine");
    wakeLock.release();
    watchFace.wakelockDebug = wakeLock.isHeld();
    timeTick.removeCallbacks(timeRunnable);
    releaseGoogleApiClient();
    super.onDestroy();
}
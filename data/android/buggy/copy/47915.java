@java.lang.Override
protected void onPause() {
    com.mendhak.gpslogger.Utilities.LogDebug("GpsMainActivity.onPause");
    StopAndUnbindServiceIfRequired();
    super.onPause();
}
@java.lang.Override
protected void onDestroy() {
    android.util.Log.i(com.holger.mashpit.TempChartActivity.DEBUG_TAG, "onDestroy");
    MashPit.sensors.clear();
    snb.stopEvents();
    super.onDestroy();
}
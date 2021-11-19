@java.lang.Override
protected void onDestroy() {
    android.util.Log.i(com.holger.mashpit.TempChartActivity.DEBUG_TAG, "onDestroy");
    snb.stopEvents();
    super.onDestroy();
}
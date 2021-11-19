@java.lang.Override
protected void onDestroy() {
    android.util.Log.i(floatingmuseum.sample.sonic.MainActivity.TAG, "onDestroy");
    sonic.stopAllTask();
    sonic.unRegisterDownloadListener();
    super.onDestroy();
}
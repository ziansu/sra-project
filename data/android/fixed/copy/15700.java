@java.lang.Override
protected void onDestroy() {
    android.util.Log.i(floatingmuseum.sample.sonic.MainActivity.TAG, "onDestroy");
    sonic.unRegisterDownloadListener();
    super.onDestroy();
}
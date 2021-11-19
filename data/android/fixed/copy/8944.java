@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mHandlerThread) != null) {
        mHandlerThread.quit();
    }
    android.util.Log.v(TAG, "onDestroy");
}
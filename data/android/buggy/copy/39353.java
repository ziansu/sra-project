@java.lang.Override
protected void onResume() {
    super.onResume();
    wakeLock();
    android.util.Log.d(com.neirx.stopwatchtimer.MainActivity.TAG, ((com.neirx.stopwatchtimer.MainActivity.CLASS_NAME) + "onResume"));
}
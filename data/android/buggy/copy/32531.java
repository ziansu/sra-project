@java.lang.Override
protected void onPause() {
    android.util.Log.d(com.cross.CrossActivity.TAG, "onPause");
    super.onPause();
    if (com.cross.CrossActivity.cross_initialized) {
        com.cross.CrossActivity.cross.Suspend();
        renderer.onPause();
    }
}
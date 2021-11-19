public void onServiceDisconnected(android.content.ComponentName className) {
    mStumblerService = null;
    android.util.Log.d(LOG_TAG, "Service disconnected", new java.lang.Exception());
}
@java.lang.Override
protected void onStart() {
    android.content.Intent intent = new android.content.Intent(this, com.android.grabhouse.GPSTracker.class);
    bindService(intent, connection, Context.BIND_AUTO_CREATE);
    super.onStart();
}
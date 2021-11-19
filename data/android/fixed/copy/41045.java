@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    if (intent.getAction().equals("GETLOCATION")) {
        startLocationUpdates();
    }
}
private void initialize(android.content.Context context) {
    context.registerReceiver(connectionReceiver, new android.content.IntentFilter(android.net.ConnectivityManager.CONNECTIVITY_ACTION));
}
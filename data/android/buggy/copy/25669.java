public void initialize(android.content.Context context) {
    this.currentConnectionType = getConnectionType();
    context.registerReceiver(connectionReceiver, new android.content.IntentFilter(android.net.ConnectivityManager.CONNECTIVITY_ACTION));
}
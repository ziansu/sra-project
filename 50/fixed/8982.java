public void registerNetworkReceiver() {
    android.content.IntentFilter filter = new android.content.IntentFilter();
    filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
    registerReceiver(mNetworkStateReceiver, filter);
}
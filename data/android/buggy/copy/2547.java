private boolean netCheckin() {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo netInfo = cm.getActiveNetworkInfo();
    return (netInfo != null) && (netInfo.isConnectedOrConnecting());
}
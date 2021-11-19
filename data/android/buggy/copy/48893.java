private boolean isNetworkAvailable() {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (mContext.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
    return (activeNetworkInfo != null) && (activeNetworkInfo.isConnected());
}
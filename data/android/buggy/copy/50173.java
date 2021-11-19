public static boolean isNetworkConnected() {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (getSystemService(Context.CONNECTIVITY_SERVICE)));
    return (cm.getActiveNetworkInfo()) != null;
}
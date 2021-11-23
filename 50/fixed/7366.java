public boolean isNetworkAvailable(android.content.Context context) {
    if (context == null) {
        return true;
    }
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    return (cm.getActiveNetworkInfo()) != null;
}
public static boolean isNetworkConnected(android.content.Context context) {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    return (cm.getActiveNetworkInfo()) != null;
}
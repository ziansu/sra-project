public static boolean checkConnection(android.content.Context context) {
    if (context == null) {
        return false;
    }
    if (org.wordpress.android.util.NetworkUtils.isNetworkAvailable(context)) {
        return true;
    }
    org.wordpress.android.util.ToastUtils.showToast(context, R.string.no_network_message);
    return false;
}
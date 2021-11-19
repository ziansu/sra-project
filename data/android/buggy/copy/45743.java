public static boolean canShowWelcomeScreen(android.content.Context context) {
    final android.content.SharedPreferences prefs = context.getSharedPreferences(com.android.dialer.util.DialerUtils.PREFS_MESSAGE, Context.MODE_PRIVATE);
    return prefs.getBoolean(com.android.dialer.util.DialerUtils.KEY_STATE, true);
}
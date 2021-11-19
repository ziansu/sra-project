public static boolean IsDebug(android.content.Context context) {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean("debugMode", true);
}
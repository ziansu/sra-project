private java.lang.String getLastModified(android.content.Context context) {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    return prefs.getString(((name) + "Last"), "");
}
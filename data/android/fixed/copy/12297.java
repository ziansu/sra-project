public static java.lang.Double getDoubleFromPreferences(android.content.Context context, java.lang.String name) {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    return ((double) (preferences.getFloat(name, 0)));
}
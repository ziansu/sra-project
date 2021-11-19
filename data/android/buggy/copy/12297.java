public static java.lang.Double getDoubleFromPreferences(android.content.Context context, java.lang.String name) {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    return java.lang.Double.valueOf(preferences.getFloat(name, 0));
}
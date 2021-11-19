public static java.lang.String restoreDefaultFont(android.content.Context context) {
    android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putString(context.getString(R.string.settings_change_font_key), context.getString(R.string.settings_change_font_default_value)).apply();
    return context.getString(R.string.settings_change_font_default_value);
}
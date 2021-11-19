public static java.lang.String getLastAddr(android.content.Context context) {
    android.content.SharedPreferences pref = context.getSharedPreferences(com.cooper.wheellog.SettingsManager.key, Context.MODE_PRIVATE);
    if (pref.contains("last_mac")) {
        return pref.getString("last_mac", "");
    }
    return "";
}
public static void storeSession(android.content.Context context, long session) {
    android.content.SharedPreferences sharedPreferences = com.silverpop.engage.config.EngageConfig.getConfigSharedPrefs(context);
    sharedPreferences.edit().putLong(com.silverpop.engage.config.EngageConfig.SharedProperties.SESSION.toString(), session).commit();
}
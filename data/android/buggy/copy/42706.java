public static void storeRecipientId(android.content.Context context, java.lang.String recipientId) {
    android.content.SharedPreferences sharedPreferences = com.silverpop.engage.config.EngageConfig.getConfigSharedPrefs(context);
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putString(com.silverpop.engage.config.EngageConfig.SharedProperties.RECIPIENT_ID.toString(), recipientId).commit();
}
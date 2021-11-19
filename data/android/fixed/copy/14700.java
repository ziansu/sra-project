public static synchronized java.lang.String getLanguage(android.content.Context context) {
    return com.artemzin.android.wail.storage.WAILSettings.getSharedPreferences(context).getString(com.artemzin.android.wail.storage.WAILSettings.KEY_LOCALE, null);
}
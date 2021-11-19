public static synchronized void registerWakeupBroadcast(android.content.Context context, android.content.Intent intent) {
    com.magnet.mmx.client.api.MMX.getSharedPrefs(context).edit().putString(com.magnet.mmx.client.api.MMX.PREF_WAKEUP_INTENT_URI, intent.toUri(Intent.URI_INTENT_SCHEME)).apply();
}
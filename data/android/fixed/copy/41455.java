public static synchronized void unregisterWakeupBroadcast(android.content.Context context) {
    com.magnet.mmx.client.api.MMX.getSharedPrefs(context).edit().remove(com.magnet.mmx.client.api.MMX.PREF_WAKEUP_INTENT_URI).apply();
}
public static synchronized void unregisterWakeupBroadcast() {
    com.magnet.mmx.client.api.MMX.getSharedPrefs().edit().remove(com.magnet.mmx.client.api.MMX.PREF_WAKEUP_INTENT_URI).apply();
}
private static synchronized android.content.SharedPreferences getSharedPrefs() {
    if ((com.magnet.mmx.client.api.MMX.sSharedPrefs) == null) {
        com.magnet.mmx.client.api.MMX.sSharedPrefs = com.magnet.max.android.MaxCore.getApplicationContext().getSharedPreferences(com.magnet.mmx.client.api.MMX.SHARED_PREFS_NAME, Context.MODE_PRIVATE);
    }
    return com.magnet.mmx.client.api.MMX.sSharedPrefs;
}
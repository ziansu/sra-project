private boolean isFirstStart() {
    android.content.SharedPreferences getPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(getBaseContext());
    return getPrefs.getBoolean(io.gloop.drawed.SplashActivity.SHARED_PREFERENCES_FIRST_START, true);
}
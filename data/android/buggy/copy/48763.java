@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals(ml.puredark.hviewer.activities.SettingActivity.SettingFragment.KEY_PREF_PROXY_ENABLED)) {
        updateProxyOptions(sharedPreferences.getBoolean(key, true));
    }
}
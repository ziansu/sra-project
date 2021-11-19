public void onDestroy() {
    super.onDestroy();
    getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
}
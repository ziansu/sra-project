public void onDestroy() {
    getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    super.onDestroy();
}
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.preference.PreferenceManager.setDefaultValues(getActivity(), R.xml.prefs, false);
    addPreferencesFromResource(R.xml.prefs);
    com.alderferstudios.ritdebitsplitter.SettingsActivity.shared.registerOnSharedPreferenceChangeListener(this);
}
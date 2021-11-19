@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_general);
    setHasOptionsMenu(true);
    com.cogn.wifirecord.SettingsActivity.bindPreferenceSummaryToValue(findPreference("example_text"));
    com.cogn.wifirecord.SettingsActivity.bindPreferenceSummaryToValue(findPreference(getString(R.string.key_number_of_scans)));
}
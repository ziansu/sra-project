private void updateSummaryList(java.lang.String key) {
    android.preference.ListPreference updatedPref = ((android.preference.ListPreference) (settingsFragment.findPreference(key)));
    updatedPref.setSummary(updatedPref.getEntry());
}
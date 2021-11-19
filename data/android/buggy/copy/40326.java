private static void bindPreferenceSummaryToValue(android.preference.Preference preference) {
    preference.setOnPreferenceChangeListener(com.example.vijay.popularmovies.SettingsActivity.sBindPreferenceSummaryToValueListener);
    com.example.vijay.popularmovies.SettingsActivity.sBindPreferenceSummaryToValueListener.onPreferenceChange(preference, android.preference.PreferenceManager.getDefaultSharedPreferences(preference.getContext()).getString(preference.getKey(), ""));
}
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    ((android.preference.EditTextPreference) (preference)).setSummary(newValue.toString());
    return true;
}
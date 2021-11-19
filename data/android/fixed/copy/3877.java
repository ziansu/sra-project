public boolean onPreferenceClick(android.preference.Preference preference) {
    (version_taps)++;
    if ((version_taps) == 3) {
        android.util.Log.d("Easter egg", "Activated");
        version_taps = 0;
    }
    return true;
}
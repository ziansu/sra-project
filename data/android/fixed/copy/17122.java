@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals(app.program.SettingsActivity.SettingsFragment.KEY_PREF_LANGUAGE)) {
        android.widget.Toast.makeText(getActivity(), sharedPreferences.toString(), Toast.LENGTH_SHORT).show();
    }
}
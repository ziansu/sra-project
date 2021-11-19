@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    if (preference == (this)) {
        android.util.Log.d(de.grau.organizer.settings.DeleteCategoriePreference.DEBUG_TAG, "Clicked deleteDialog");
        setValues();
    }
    return true;
}
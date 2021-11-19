@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    preference.setSummary(getString(fr.free.nrw.commons.Utils.licenseNameFor(((java.lang.String) (newValue)))));
    return true;
}
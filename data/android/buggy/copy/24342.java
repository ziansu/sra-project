protected boolean isValidFragment(java.lang.String fragmentName) {
    android.util.Log.d("FRAG FETCH", "degug stop...");
    return (android.preference.PreferenceFragment.class.getName().equals(fragmentName)) || (com.is.was.be.wannareddit.SettingsActivity.GeneralPreferenceFragment.class.getName().equals(fragmentName));
}
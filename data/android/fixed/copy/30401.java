@java.lang.Override
public boolean onPreferenceClick(final android.preference.Preference preference) {
    de.geithonline.wallpaperdesigner.settings.SettingsIO.loadDesignTheFancyWay(getActivity(), Settings.prefs, true);
    return true;
}
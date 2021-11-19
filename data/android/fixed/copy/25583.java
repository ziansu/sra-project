@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    new com.antest1.kcanotify.SettingActivity.getKcaStart2Data(getActivity()).execute();
    return false;
}
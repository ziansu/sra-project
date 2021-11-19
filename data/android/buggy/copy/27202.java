@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    android.widget.Toast.makeText(getActivity(), getString(R.string.UnfinishedFeatureText), Toast.LENGTH_SHORT).show();
    return true;
}
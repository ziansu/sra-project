@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    android.widget.Toast.makeText(context, ("you clicl on" + prefName), Toast.LENGTH_SHORT).show();
    return false;
}
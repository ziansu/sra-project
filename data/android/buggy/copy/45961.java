@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference anon, java.lang.Object val) {
    java.lang.Boolean disable = ((java.lang.Boolean) (val));
    if (disable.booleanValue()) {
        setTheme(R.style.AppTheme_Dark);
    }else {
        setTheme(R.style.anonTheme);
    }
    return false;
}
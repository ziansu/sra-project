public static android.content.SharedPreferences.Editor getPreferencesEditor(android.content.Context context) {
    if ((ds.framework.v4.Settings.sPreferencesEditor) != null) {
        return ds.framework.v4.Settings.sPreferencesEditor;
    }
    return ds.framework.v4.Settings.getPreferences(context).edit();
}
public void onSharedPreferenceChanged(android.content.SharedPreferences prefs, java.lang.String key) {
    switch (key) {
        case com.af.synapse.Settings.PREF_THEME :
            {
                com.af.synapse.Settings.theme = null;
                com.af.synapse.Settings.setWallpaper(Utils.mainActivity);
                com.af.synapse.Settings.setWallpaper(Utils.settingsActivity);
                break;
            }
    }
}
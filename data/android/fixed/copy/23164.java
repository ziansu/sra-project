public boolean contains(java.lang.String key) {
    android.content.SharedPreferences prefs = getSharedPreferences();
    return prefs.contains(key);
}
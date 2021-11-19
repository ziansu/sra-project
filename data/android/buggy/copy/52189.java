private java.util.Set<java.lang.String> getStringSetFromSharedPreferences(java.lang.String preferenceName) {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(mContext);
    return prefs.getStringSet(preferenceName, new java.util.HashSet<java.lang.String>());
}
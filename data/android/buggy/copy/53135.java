public java.lang.String readPref(java.lang.String key, java.lang.String defaultValue) {
    return me.wizos.loread.data.WithSet.mySharedPreferences.getString(key, defaultValue);
}
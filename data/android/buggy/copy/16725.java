public long readPref(java.lang.String key, long value) {
    return me.wizos.loread.data.WithSet.mySharedPreferences.getLong(key, value);
}
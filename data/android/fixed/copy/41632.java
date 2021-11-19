public long getLong(java.lang.String key, long defValue) {
    return getSharedPreferences().getLong(key, defValue);
}
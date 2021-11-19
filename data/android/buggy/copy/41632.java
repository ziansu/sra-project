public long getLong(java.lang.String key, long defValue) {
    long value = getSharedPreferences().getLong(key, defValue);
    return value;
}
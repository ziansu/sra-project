public void putLong(java.lang.String key, long value) {
    checkForNullKey(key);
    preferences.edit().putLong(key, value).apply();
}
public void putInt(java.lang.String key, int value) {
    checkForNullKey(key);
    preferences.edit().putInt(key, value).apply();
}
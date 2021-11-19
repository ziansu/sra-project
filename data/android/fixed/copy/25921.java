public boolean getBoolean(java.lang.String key, boolean defValue) {
    return getSharedPreferences().getBoolean(key, defValue);
}
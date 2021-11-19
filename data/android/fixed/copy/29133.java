public void putBoolean(java.lang.String key, boolean value) {
    if (key == null)
        return ;
    
    preferences.edit().putBoolean(key, value).apply();
}
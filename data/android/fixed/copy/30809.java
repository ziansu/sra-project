private double getDoubleFromLongFromPrefs(java.lang.String key) {
    if (!(sharedPreferences.contains(key)))
        return 0;
    
    return java.lang.Double.longBitsToDouble(sharedPreferences.getLong(key, 0));
}
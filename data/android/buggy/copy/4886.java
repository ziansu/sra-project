public float getFloat(java.lang.String key, float defValue) {
    float value = getSharedPreferences().getFloat(key, defValue);
    return value;
}
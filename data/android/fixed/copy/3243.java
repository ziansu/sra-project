java.lang.String getString(java.lang.String key, java.lang.String defaultValue) {
    return configValues.containsKey(key) ? configValues.get(key) : defaultValue;
}
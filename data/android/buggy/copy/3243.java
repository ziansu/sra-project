boolean getBoolean(java.lang.String key, boolean defaultValue) {
    return configValues.containsKey(key) ? java.lang.Boolean.parseBoolean(configValues.get(key)) : defaultValue;
}
private boolean getBooleanProperty(java.lang.String systemPropertyName, boolean mavenPropertyValue) {
    java.lang.String systemPropertyValue = java.lang.System.getProperty(systemPropertyName);
    if (systemPropertyValue != null) {
        return java.lang.Boolean.getBoolean(systemPropertyValue);
    }
    return mavenPropertyValue;
}
private java.lang.String getString(java.lang.String value) {
    if (value == null) {
        return null;
    }
    return value.replace(org.schedoscope.metascope.config.MetascopeConfig.METASCOPE_JAR_LOCATION, classLocations).trim();
}
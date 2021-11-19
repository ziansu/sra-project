private java.lang.String getString(java.lang.String value) {
    return value.replace(org.schedoscope.metascope.config.MetascopeConfig.METASCOPE_JAR_LOCATION, classLocations).trim();
}
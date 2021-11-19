private static java.lang.String getEnv(java.lang.String name, java.lang.String defaultValue) {
    java.lang.String value = java.lang.System.getenv(name);
    if (value != null) {
        return value;
    }else {
        return defaultValue;
    }
}
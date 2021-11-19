private java.util.Properties loadDefaultsFromPropertiesFile() {
    java.util.Properties defaultProperties = new java.util.Properties();
    try {
        if ((propertiesFilePath) != null) {
            defaultProperties.load(java.nio.file.Files.newInputStream(propertiesFilePath));
        }
    } catch (java.io.IOException e) {
    }
    return defaultProperties;
}
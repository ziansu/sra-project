private java.util.Properties loadDefaultsFromPropertiesFile() {
    java.util.Properties defaultProperties = new java.util.Properties();
    try {
        defaultProperties.load(java.nio.file.Files.newInputStream(this.propertiesFilePath));
    } catch (java.io.IOException e) {
    }
    return defaultProperties;
}
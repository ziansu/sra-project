private void loadProperties(java.nio.file.Path propertiesPath) {
    try (java.io.InputStream is = java.nio.file.Files.newInputStream(propertiesPath)) {
        properties.load(is);
    } catch (java.io.IOException e) {
        org.rl.scheduled.turnoff.MainController.LOGGER.error("Failed loading properties file.", e);
    }
}
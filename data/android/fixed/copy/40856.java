public void loadConfigFromCache() {
    com.boundlessgeo.spatialconnect.config.SCConfig config = getCachedConfig();
    if (config != null) {
        loadConfig(config);
    }
}
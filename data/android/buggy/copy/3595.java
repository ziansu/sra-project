public void writeConfigFile(cs2103_w09_1j.esther.Config config) throws java.io.IOException {
    Storage.storageLogger.info("Writing config file");
    java.lang.String configString = config.toString();
    writeFile(configString, Storage.configPath);
}
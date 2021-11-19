private boolean isPropertiesVersionCorrect() {
    java.util.Properties properties = readProperties(Constants.CONFIG_PATH);
    java.lang.String version = properties.getProperty("version");
    if (version.equals(Constants.PRODUCT_VERSION)) {
        return true;
    }
    return false;
}
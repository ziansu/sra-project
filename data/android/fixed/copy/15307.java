protected java.util.Properties mergeProperties() throws java.io.IOException {
    java.util.Properties result = super.mergeProperties();
    com.navercorp.pinpoint.common.util.ConfigCenterLoader configCenterLoader = new com.navercorp.pinpoint.common.util.ConfigCenterLoader();
    java.util.Properties properties = configCenterLoader.loader(result);
    com.navercorp.pinpoint.common.util.ConfigCenterLoader.overrideProperies(properties, result);
    return result;
}
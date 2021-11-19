private java.util.Properties readLisProperties() {
    return new com.luckia.biller.core.common.SettingsManager().load(Constants.APP_CONFIG_FILE).getProperties(Constants.CONFIG_SECTION_JPA_LIS);
}
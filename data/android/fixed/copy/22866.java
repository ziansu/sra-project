public static org.backmeup.zip.utils.PropertiesUtil getInstance() {
    if ((org.backmeup.zip.utils.PropertiesUtil.propertiesUtil) == null) {
        org.backmeup.zip.utils.PropertiesUtil.propertiesUtil = new org.backmeup.zip.utils.PropertiesUtil();
    }
    if ((org.backmeup.zip.utils.PropertiesUtil.properties) == null) {
        org.backmeup.zip.utils.PropertiesUtil.loadProperties();
    }
    return org.backmeup.zip.utils.PropertiesUtil.propertiesUtil;
}
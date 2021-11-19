public static java.lang.String getConfig(java.lang.String key, java.lang.String default_val) {
    java.lang.String value = org.loklak.data.DAO.config.getProperty(key);
    return value == null ? default_val : value;
}
public static org.apache.roller.weblogger.business.WebloggerStaticConfig.AuthMethod getAuthMethod() {
    return org.apache.roller.weblogger.business.WebloggerStaticConfig.AuthMethod.valueOf(org.apache.roller.weblogger.business.WebloggerStaticConfig.getProperty("authentication.method", "DB").toUpperCase());
}
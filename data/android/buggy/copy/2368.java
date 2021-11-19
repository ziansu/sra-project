java.lang.String getAndLogTokenHandlerProperty(java.lang.String property) {
    java.lang.String value = org.apache.commons.lang3.StringUtils.trim(tokenHandlerProp.getProperty(property));
    return value;
}
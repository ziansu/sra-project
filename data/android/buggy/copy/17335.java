public static java.lang.String upperCamelCaseName(java.lang.String stringValue) {
    return com.google.common.base.CaseFormat.UPPER_CAMEL.to(com.google.common.base.CaseFormat.LOWER_CAMEL, stringValue);
}
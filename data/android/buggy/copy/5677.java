public static boolean isOverrideSet(final java.lang.String propertyName) {
    java.lang.String value = java.lang.System.getProperty(propertyName);
    if (value == null) {
        return false;
    }
    return "true".equals(org.bouncycastle.util.Strings.toLowerCase(value));
}
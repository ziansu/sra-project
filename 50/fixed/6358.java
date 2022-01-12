public static <T> T getProperty(org.simplejavamail.internal.util.ConfigLoader.Property property) {
    return ((T) (org.simplejavamail.internal.util.ConfigLoader.RESOLVED_PROPERTIES.get(property)));
}
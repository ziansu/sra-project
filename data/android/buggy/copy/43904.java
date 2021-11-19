private static java.lang.String propertyNameToLabel(java.lang.String propertyName) {
    return org.apache.commons.lang.WordUtils.capitalize(propertyName.toLowerCase().replace("x-", "").replace("_", " "));
}
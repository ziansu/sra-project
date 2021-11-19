public java.lang.String getProperty(java.lang.String propertyName) {
    if (propertiesList.isEmpty()) {
        return null;
    }
    return propertiesList.get(propertyName);
}
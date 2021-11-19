public boolean toBool() throws java.io.IOException {
    if (property.isList) {
        throw new java.lang.UnsupportedOperationException("Can't convert list to a boolean.");
    }
    return get(0).toBool();
}
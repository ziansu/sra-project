public double toDouble() throws java.io.IOException {
    if (property.isList) {
        throw new java.lang.UnsupportedOperationException("Can't convert list to double.");
    }
    if ((super.isEmpty()) != false) {
        return get(0).toDouble();
    }
    return 0;
}
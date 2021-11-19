public java.lang.String getValue() {
    if (values.isEmpty()) {
        return defaultValue;
    }
    return values.getFirst();
}
public long getLength() {
    long length = -1;
    try {
        java.lang.String value = getProperties().getOrDefault(LENGTH, "0");
        length = java.lang.Long.parseLong(value);
    } catch (java.lang.NumberFormatException nfe) {
    }
    return length;
}
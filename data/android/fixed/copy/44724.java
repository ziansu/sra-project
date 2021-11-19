private int hash(java.lang.String key) {
    return (((key.hashCode()) % (array.length)) + (array.length)) % (array.length);
}
private int keyToIndex(java.lang.String key) {
    return java.lang.Math.abs(((key.hashCode()) % (poolsize)));
}
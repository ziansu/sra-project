public boolean contains(java.lang.String key) {
    int arrayIndex = hash(key);
    return ((array[arrayIndex]) != null) && ((array[arrayIndex].get(key)) != null);
}
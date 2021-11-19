public java.lang.String getString(K key) {
    return containsKey(key) ? get(key).toString() : null;
}
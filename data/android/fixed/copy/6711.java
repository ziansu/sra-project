public java.lang.String getString(K key) {
    return containsKey(key) ? (get(key)) == null ? null : get(key).toString() : null;
}
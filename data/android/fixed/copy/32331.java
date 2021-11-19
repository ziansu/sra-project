@java.lang.Override
public java.util.Set<V> getCopy(final K key) {
    final java.util.Set<V> values = get(key);
    return values == null ? null : new java.util.LinkedHashSet<V>(values);
}
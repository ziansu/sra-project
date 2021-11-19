@java.lang.Override
public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
    return new BackingSet(parent);
}
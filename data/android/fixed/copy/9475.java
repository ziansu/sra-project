@java.lang.Override
public V put(K key, V value) {
    this.put(this.size(), key, value);
    return null;
}
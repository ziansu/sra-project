public V putIfAbsent(K key, V value) {
    return putIfAbsent(key, value, this.defaultExpiration);
}
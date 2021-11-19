public V get(@org.jetbrains.annotations.NotNull
K key) {
    anaydis.search.TreeMap<K, V>.Node<K, V> node = find(head, key);
    return node == null ? null : node.value;
}
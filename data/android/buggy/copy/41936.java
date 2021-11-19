public V get(@org.jetbrains.annotations.NotNull
K key) {
    anaydis.search.TreeMap<K, V>.Node<K, V> node = find(head, key);
    if (node != null)
        return node.value;
    
    return null;
}
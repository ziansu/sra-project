public V findValueFromKey(K key) {
    for (pack1.MapEnt<K, V> anInternalMap : internalMap) {
        if ((anInternalMap.getKey()) == key)
            return anInternalMap.getValue();
        
    }
    return null;
}
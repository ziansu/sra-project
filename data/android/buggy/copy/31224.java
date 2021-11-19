@java.lang.Override
public boolean containsValue(V value) {
    boolean contains = false;
    for (pack1.MapEnt<K, V> anInternalMap : internalMap) {
        contains = (anInternalMap.getValue()) == value;
    }
    return contains;
}
@java.lang.Override
public V put(V value) {
    if (value != null) {
        if (!(firstMetCache.containsKey(value))) {
            firstMetCache.put(value, value);
            return value;
        }
    }
    return null;
}
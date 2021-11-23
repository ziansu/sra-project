@java.lang.Override
public V put(V value) {
    if (value != null) {
        if (!(lastMetCache.add(value))) {
            lastMetCache.remove(value);
            lastMetCache.add(value);
        }
    }
    return null;
}
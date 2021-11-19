@java.lang.Override
public java.util.Collection<V> values() {
    return allKeys.stream().map(this::get).collect(java.util.stream.Collectors.toList());
}
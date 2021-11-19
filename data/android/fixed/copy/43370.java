@java.lang.Override
protected boolean removeEldestEntry(java.util.Map.Entry<K, java.util.List<org.springframework.boot.context.properties.source.PropertyMapping>> eldest) {
    return (size()) > (this.capacity);
}
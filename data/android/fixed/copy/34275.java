public boolean add(java.lang.Object key, java.lang.Object value) {
    buffer.put(key, value);
    (size)++;
    return (buffer.size()) >= (threshold);
}
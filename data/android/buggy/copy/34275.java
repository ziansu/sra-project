public boolean add(java.lang.Object key, java.lang.Object value) {
    synchronized(mutex) {
        buffer.put(key, value);
        (size)++;
        return (buffer.size()) >= (threshold);
    }
}
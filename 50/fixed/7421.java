public boolean contains(java.lang.Object o) {
    synchronized(map) {
        return map.containsKey(o);
    }
}
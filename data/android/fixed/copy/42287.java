public boolean hasType(java.lang.Class<?> typeName) {
    synchronized(map) {
        return map.containsKey(typeName);
    }
}
public java.lang.Long getDelta(java.lang.String name, long count) {
    java.lang.Long previous = lookup.put(name, count);
    return calculateDelta(name, previous, count);
}
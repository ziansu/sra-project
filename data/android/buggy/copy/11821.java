public java.lang.Long peekDelta(java.lang.String name, long count) {
    java.lang.Long previous = lookup.get(name);
    if (previous == null) {
        previous = 0L;
    }
    return calculateDelta(name, previous, count);
}
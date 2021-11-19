private static boolean isEmpty(java.lang.Iterable<?> iterable) {
    return iterable instanceof java.util.Collection ? ((java.util.Collection<?>) (iterable)).isEmpty() : !(iterable.iterator().hasNext());
}
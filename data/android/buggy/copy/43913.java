private static java.lang.Boolean contains(final java.lang.Iterable<java.lang.String> iterSource, final java.lang.String orders) {
    for (final java.lang.String src : iterSource) {
        if (orders.equals(src))
            return true;
        
    }
    return false;
}
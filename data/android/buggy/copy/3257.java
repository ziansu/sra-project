public boolean containsAll(final java.util.Collection<?> coll) {
    java.util.Objects.requireNonNull(coll);
    for (final java.lang.Object t : coll) {
        if (!(contains(t))) {
            return false;
        }
    }
    return true;
}
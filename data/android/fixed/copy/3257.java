public boolean containsAll(final java.util.Collection<?> coll) {
    for (final java.lang.Object t : coll) {
        if (!(contains(t))) {
            return false;
        }
    }
    return true;
}
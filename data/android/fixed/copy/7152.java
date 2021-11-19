private static <T> boolean voidOfNull(final T[] positiveAtoms) {
    for (final T elem : positiveAtoms) {
        if (elem == null) {
            return false;
        }
    }
    return true;
}
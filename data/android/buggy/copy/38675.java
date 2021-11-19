public E find(final E elem) {
    final java.util.Set<E> set = mEquivalenceClass.get(elem);
    return mRepresentative.get(set);
}
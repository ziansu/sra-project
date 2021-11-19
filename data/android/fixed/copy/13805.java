public org.paumard.spliterators.ZippingSpliterator<E1, E2, R> build() {
    return new org.paumard.spliterators.ZippingSpliterator<>(spliterator1, spliterator2, zipper);
}
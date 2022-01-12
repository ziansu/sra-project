private MinHeap.HeapEntry<E> getParent(MinHeap.HeapEntry<E> node) {
    if ((node.pos) == 0) {
        return null;
    }
    return getAt((((node.pos) - 1) / 2));
}
private MinHeap.HeapEntry<E> getParent(MinHeap.HeapEntry<E> node) {
    return getAt((((node.pos) - 1) / 2));
}
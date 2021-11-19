public void insert(E item) {
    heap[((currentIndex)++)] = item;
    if ((currentIndex) == (heap.length)) {
        resize();
    }
    enforceInvariant(currentIndex);
}
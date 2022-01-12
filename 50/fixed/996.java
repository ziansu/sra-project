private void orderHeap() {
    if (!(dirty)) {
        return ;
    }
    heapSort(1, size);
    dirty = false;
}
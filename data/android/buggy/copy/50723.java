void build_heap(int[] arrayToHeap) {
    int k;
    load = (getArLoad(arrayToHeap)) - 1;
    for (k = (load) / 2; k >= 0; k--) {
        minHeap(arrayToHeap, k);
    }
}
public java.lang.Integer remove() {
    java.lang.Integer popped = heap[idv.carl.datastructures.heaptree.MinHeap.FRONT];
    heap[idv.carl.datastructures.heaptree.MinHeap.FRONT] = heap[size];
    heap[size] = null;
    (size)--;
    minHeapify(idv.carl.datastructures.heaptree.MinHeap.FRONT);
    return popped;
}
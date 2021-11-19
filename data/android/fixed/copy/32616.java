public static void heapify(int[] arr) {
    for (int i = (arr.length) - 1; i >= 0; i--) {
        HeapSort.pushDown(arr, i);
    }
}
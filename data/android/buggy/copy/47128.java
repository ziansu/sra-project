private static void swap(int[] arr, int i, int min) {
    int tmp = i;
    i = arr[min];
    arr[min] = tmp;
}
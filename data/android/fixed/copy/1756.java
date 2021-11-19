static void bubbleSortNTimes(int[] array, long loopCount) {
    for (long i = 1; i <= loopCount; i++) {
        medium.InterruptedBubbleSort.bubbleSortOneIteration(array);
    }
}
public void enqueueArray(int priority, T[] array) {
    for (int i = 0; i < (array.length); i++) {
        this.enqueue(priority, array[i]);
    }
}
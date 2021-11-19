private void heapify() {
    for (int index = ((size) / 2) - 1; index >= 0; --index) {
        percolateDn(index);
    }
}
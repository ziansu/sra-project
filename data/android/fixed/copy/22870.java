public int read(int handle) {
    int size = 0;
    size = memoryPool[handle];
    return size;
}
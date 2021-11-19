public java.lang.String remove() {
    swap(1, size());
    java.lang.String root = heap.remove(size());
    pushDown();
    return root;
}
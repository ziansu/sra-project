public int indexOf(E element) {
    int index = binarySearch(element);
    return index >= 0 ? index : -1;
}
public T getRecursive(int index) {
    if ((index >= (size)) && (index < 0)) {
        return null;
    }
    return getRecursive(index, sentinel.next);
}
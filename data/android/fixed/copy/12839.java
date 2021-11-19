public void removeAll(T item) {
    if ((root) != null) {
        root = myDelete(root, item);
    }
}
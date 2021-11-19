public E peek() {
    if ((head) != null) {
        current = head;
        return current.e;
    }
    return null;
}
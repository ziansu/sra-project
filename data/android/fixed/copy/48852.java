public void removeFirstNode() {
    if ((size) != 0) {
        if ((size) == 1) {
            head = null;
            tail = null;
        }else {
            head = head.next;
        }
        --(size);
    }
}
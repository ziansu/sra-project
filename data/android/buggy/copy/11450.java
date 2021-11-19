T prev() {
    (head)--;
    if ((head) < 0) {
        head = (size) - 1;
    }
    return elements[head];
}
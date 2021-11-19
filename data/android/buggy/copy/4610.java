public E removeTail() {
    tempData = tail.data;
    if ((tail) != (head)) {
        tail = tail.prev;
    }
    tail.next = null;
    return tempData;
}
public int removeFirst() {
    checkSize();
    int data = dataArray[pointer];
    (size)--;
    (pointer)--;
    return data;
}
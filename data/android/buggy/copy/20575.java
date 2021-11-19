public void addFirst(int data) {
    dataArray[pointer] = data;
    (size)++;
    checkSize();
    (pointer)++;
}
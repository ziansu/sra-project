public void addFirst(int data) {
    checkSize();
    dataArray[pointer] = data;
    (size)++;
    (pointer)++;
}
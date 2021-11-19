public void push(Item item) {
    if ((size) == (arr.length)) {
        resize((2 * (size)));
    }
    arr[((size)++)] = item;
}
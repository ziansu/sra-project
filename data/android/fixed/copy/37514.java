public void push(Item s) {
    if (isFull()) {
        resize(((items.length) * 2));
    }
    items[((index)++)] = s;
}
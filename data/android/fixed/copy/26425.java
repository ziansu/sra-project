public void push(int i) {
    if (!(isFull())) {
        items[((total)++)] = i;
    }
}
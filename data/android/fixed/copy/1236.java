public int top() {
    if (isEmpty()) {
        return STACK_EMPTY;
    }
    return items[((total) - 1)];
}
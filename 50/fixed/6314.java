public void push(E element) {
    ensureCapacity(1);
    elements[((size)++)] = element;
}
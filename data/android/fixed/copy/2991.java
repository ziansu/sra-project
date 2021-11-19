public void add(Item data) {
    elements[((n)++)] = data;
    if ((n) == (capacity)) {
        resize(((capacity) * 2));
    }
}
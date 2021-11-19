public void push(Item s) {
    if (isFull()) {
        java.lang.System.out.println("\n\tIncreasing stack array size.");
        resize(((items.length) * 2));
    }
    items[((index)++)] = s;
}
@java.lang.Override
public void push(T item) {
    if ((N) == (items.length)) {
        resize((2 * (items.length)));
    }
    items[((N)++)] = item;
}
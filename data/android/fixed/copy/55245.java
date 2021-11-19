@java.lang.Override
public java.util.Iterator<Item> iterator() {
    return new QueueIterator<Item>(array, first, size);
}
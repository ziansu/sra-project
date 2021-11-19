@java.lang.Override
public T next() {
    if (!(hasNext())) {
        throw new java.util.NoSuchElementException("ObjectSet Iterator");
    }
    final T obj = next;
    this.next = null;
    return obj;
}
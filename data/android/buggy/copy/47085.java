@java.lang.Override
public boolean addAll(java.util.Collection<? extends E> c) {
    markAsStale();
    return underlyingList.addAll(c);
}
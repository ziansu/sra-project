@java.lang.Override
public boolean remove(java.lang.Object o) {
    markAsStale();
    return underlyingList.remove(o);
}
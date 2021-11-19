@java.lang.Override
public boolean remove(java.lang.Object o) {
    boolean result = underlyingList.remove(o);
    markAsStale();
    return result;
}
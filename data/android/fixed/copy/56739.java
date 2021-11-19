@java.lang.Override
protected boolean removeEldestEntry(final java.util.Map.Entry<A, B> eldest) {
    return (super.size()) > (maxEntries);
}
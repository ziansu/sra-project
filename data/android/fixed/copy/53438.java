public void addIfAbsent(E e) {
    underlyingList.addIfAbsent(e);
    markAsStale();
}
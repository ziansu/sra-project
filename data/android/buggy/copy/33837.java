public void clear() {
    log.debug("CLEAR");
    synchronized(list) {
        size = 0;
        endOffset = 0;
        startOffset = 0;
        list.clear();
    }
}
public synchronized void removeFile(java.lang.Long f) {
    fileIDs.removeAll(f);
    invalidateHashSetHitsCount();
}
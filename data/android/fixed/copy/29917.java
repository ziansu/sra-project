@javax.annotation.concurrent.GuardedBy(value = "getMetaDataRecord(newEntry.getPnfsid())")
protected void stickyChanged(org.dcache.pool.repository.CacheEntry oldEntry, org.dcache.pool.repository.CacheEntry newEntry) {
    updateRemovable(newEntry);
    org.dcache.pool.repository.StickyChangeEvent event = new org.dcache.pool.repository.StickyChangeEvent(oldEntry, newEntry);
    _stateChangeListeners.stickyChanged(event);
}
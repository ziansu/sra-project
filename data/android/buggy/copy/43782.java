private boolean shouldFlushInMemory() {
    if ((getActive().getSize()) > (inmemoryFlushSize)) {
        if (allowCompaction.get())
            return inMemoryFlushInProgress.compareAndSet(false, true);
        
    }
    return false;
}
@java.lang.Override
public void remove() {
    if ((cachedNext) == null)
        throw new java.lang.IllegalStateException("First element has not been read, element has already been removed, or iterator has finished");
    
    if (isNextCached)
        throw new java.lang.IllegalStateException("remove() must be called after next() and before the next call to hasNext()");
    
    cachedNext.remove(null);
    cachedNext = null;
}
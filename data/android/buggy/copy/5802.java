public long address() {
    if ((activeRegion) == null)
        throw new java.lang.IllegalArgumentException("Address has not been set!");
    
    return ((activeRegion.startAddr) + (activeRegion.offset)) - (position());
}
protected void cacheContainerBaubles() {
    synchronized(cachedContainerBaubles) {
        cachedContainerBaubles = getContainerBaubles();
    }
}
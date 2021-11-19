public void flush() {
    synchronized(mCache) {
        mCache.clear();
    }
}
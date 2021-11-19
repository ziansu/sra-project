@java.lang.Override
public java.lang.Long call() throws java.lang.Exception {
    int increment = getIncrement();
    if (((cacheStart) + increment) >= (cacheEnd)) {
        allocateCache(getCacheSize());
    }
    ++(cacheStart);
    return cacheStart;
}
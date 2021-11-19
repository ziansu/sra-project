public java.util.Map<java.lang.String, ?> getAll() {
    synchronized(this) {
        awaitLoadedLocked();
        return new java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object>(mMap);
    }
}
public java.util.Map<java.lang.String, ?> getAll() {
    synchronized(this) {
        awaitLoadedLocked();
        return new java.util.HashMap<java.lang.String, java.lang.Object>(mMap);
    }
}
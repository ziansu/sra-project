protected final void cacheInMemory() {
    synchronized(org.sugarj.cleardep.PersistableEntity.class) {
        org.sugarj.cleardep.PersistableEntity.inMemory.put(persistentPath, new java.lang.ref.SoftReference<>(this));
    }
}
protected final void cacheInMemory() {
    synchronized(org.sugarj.cleardep.PersistableEntity.class) {
        org.sugarj.cleardep.PersistableEntity.inMemory.put(persistentPath, this);
    }
}
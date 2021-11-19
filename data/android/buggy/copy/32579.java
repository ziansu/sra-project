public void removeStorage(final java.lang.String name) {
    synchronized(storages) {
        final com.orientechnologies.orient.server.distributed.impl.ODistributedStorage storage = storages.remove(name);
        if (storage != null) {
            storage.close(true, true);
        }
    }
}
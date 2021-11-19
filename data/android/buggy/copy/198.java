void clearLockStore(com.hazelcast.spi.ObjectNamespace namespace) {
    com.hazelcast.concurrent.lock.LockStoreImpl lockStore = lockStores.get(namespace);
    if (lockStore != null) {
        lockStore.clear();
    }
}
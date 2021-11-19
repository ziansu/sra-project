public com.emc.storageos.storagedriver.DriverTask discoverStorageProvider(com.emc.storageos.storagedriver.model.StorageProvider storageProvider, java.util.List<com.emc.storageos.storagedriver.model.StorageSystem> storageSystems) {
    com.emc.storageos.storagedriver.DriverTask Task = new com.emc.storageos.storagedriver.DenaliTask("Discover");
    return Task;
}
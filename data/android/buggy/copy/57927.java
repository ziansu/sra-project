public boolean isStorageSystemManagedByProvider() {
    return com.emc.storageos.db.client.model.Type.isProviderStorageSystem(_systemType);
}
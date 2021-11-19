private void execOb(java.lang.String methodName, java.lang.Object... args) throws com.emc.storageos.svcs.errorhandling.resources.InternalException {
    queueTask(_dbClient, com.emc.storageos.db.client.model.StorageSystem.class, _dispatcher, methodName, args);
}
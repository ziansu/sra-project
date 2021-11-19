private boolean isInProgress(com.emc.storageos.db.client.model.StorageProvider provider) {
    return DiscoveredDataObject.DataCollectionJobStatus.IN_PROGRESS.toString().equalsIgnoreCase(provider.getScanStatus());
}
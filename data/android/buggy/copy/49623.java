public boolean isError() {
    return getStatus().equals(com.emc.storageos.db.client.model.Task.Status.error.name());
}
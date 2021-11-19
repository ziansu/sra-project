public void markDirty() {
    refinedstorage.api.network.NetworkMasterSavedData.getOrLoad(world).markDirty();
}
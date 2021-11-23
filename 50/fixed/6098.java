public void addDeviceDataMap(com.emc.storageos.db.client.model.StringSetMap deviceDataMapEntries) {
    if ((this.deviceDataMap) == null) {
        this.deviceDataMap = new com.emc.storageos.db.client.model.StringSetMap();
    }
    this.deviceDataMap.putAll(deviceDataMapEntries);
}
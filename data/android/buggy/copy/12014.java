@java.lang.Override
public java.lang.Void runInTransaction() {
    hostDeviceDao.saveAllInBatch(newDevices);
    hostDeviceDao.updateAllInBatch(changedDevices);
    hostDeviceDao.removeAllInBatch(removedDevices);
    handleHostNicVfsConfigUpdate(newDevices, changedDevices, removedDevices);
    vmDeviceDao.removeAllInBatch(removedVmDevices);
    return null;
}
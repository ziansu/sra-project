public void updateDownloadSize(long size) {
    com.emc.storageos.systemservices.impl.restore.DownloadExecutor.log.info("Increase download size ={}", size);
    setDownloadStatus(remoteBackupFileName, null, 0, size, false);
}
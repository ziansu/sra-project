private void updateDownloadSize(long size) {
    com.emc.storageos.systemservices.impl.restore.DownloadExecutor.log.info("Increase download size ={}", size);
    backupOps.updateDownloadSize(remoteBackupFileName, size);
}
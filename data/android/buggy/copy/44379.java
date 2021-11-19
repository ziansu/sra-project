public static com.emc.storageos.systemservices.impl.restore.DownloadExecutor create(com.emc.storageos.systemservices.impl.jobs.backupscheduler.SchedulerConfig cfg, java.lang.String backupZipFileName, com.emc.storageos.management.backup.BackupOps backupOps, boolean notifyOthers) {
    com.emc.storageos.systemservices.impl.restore.DownloadExecutor downloader = new com.emc.storageos.systemservices.impl.restore.DownloadExecutor(cfg, backupZipFileName, backupOps, notifyOthers);
    downloader.registerListener();
    return downloader;
}
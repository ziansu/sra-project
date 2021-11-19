public boolean isReadyToDownload(com.novoda.downloadmanager.lib.CollatedDownloadInfo collatedDownloadInfo) {
    synchronized(this) {
        return (isClientReadyToDownload(collatedDownloadInfo)) && (isDownloadManagerReadyToDownload());
    }
}
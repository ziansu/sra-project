public boolean isReadyToDownload() {
    synchronized(this) {
        return (isDownloadManagerReadyToDownload()) && (isClientReadyToDownload());
    }
}
private void downloadFailedNoStorage() {
    m_downloadProgress = 0.0F;
    java.lang.String filePath = getExpansionCacheFilePath();
    com.chilliworks.chillisource.googleplay.networking.FileUtils.removeFile(FileUtils.StorageLocation.k_externalStorage, filePath);
    cleanupClientStub();
    onStateChangedFailedNoStorage();
}
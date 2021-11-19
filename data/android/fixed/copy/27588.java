private void downloadFailedNoStorage() {
    m_downloadProgress = 0.0F;
    cleanupClientStub();
    onStateChangedFailedNoStorage();
}
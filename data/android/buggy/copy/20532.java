private void downloadComplete() {
    java.lang.System.out.println("InstallerUpdater.downloadComplete()!!!!");
    com.frostwire.gui.updates.InstallerUpdater.printDownloadManagerStatus(_manager);
    saveMetaData();
    cleanupOldUpdates();
    if (checkIfDownloaded()) {
        showUpdateMessage();
    }
}
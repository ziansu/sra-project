public boolean prepareAllFiles() {
    if (prepareFiles()) {
        explorerPanel.fileList(container.getContainerPath(), preparedFiles, false);
        return true;
    }
    return false;
}
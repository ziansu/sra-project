public void setCurrentFile(java.io.File currentFile) {
    this.currentFile = currentFile;
    setDisplayName(currentFile.getName());
}
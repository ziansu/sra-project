public void setTempDirectory(java.lang.String tempDirectory) {
    this.tempDirectory = tempDirectory;
    this.tempDirectoryFile = new java.io.File(this.targetDirectory, this.tempDirectory);
}
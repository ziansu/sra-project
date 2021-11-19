private void createLogFile() {
    try {
        java.io.File newFile = new java.io.File(checkGivenFiles());
        this.file = newFile;
        this.file.createNewFile();
        (this.fileCount)++;
    } catch (java.io.IOException e) {
    }
}
private void createLogFile() {
    try {
        java.io.File newFile = new java.io.File(checkGivenFiles());
        file = newFile;
        file.createNewFile();
        (fileCount)++;
    } catch (java.io.IOException e) {
    }
}
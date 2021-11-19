private boolean canWriteToFile(java.lang.String filePath) {
    java.io.File file = new java.io.File(filePath).getParentFile();
    return file.canWrite();
}
public java.lang.String extractDropboxPath(java.io.File file) {
    java.lang.String fullFilePath = file.getAbsolutePath();
    java.lang.String fullLocalDirPath = localDir.getAbsolutePath();
    return fullFilePath.substring(fullLocalDirPath.length()).trim();
}
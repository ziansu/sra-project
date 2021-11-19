private java.lang.Boolean isFileExisting(java.lang.String pathname) {
    java.io.File file = new java.io.File(pathname);
    if ((file.exists()) && (!(file.isDirectory()))) {
        return true;
    }else
        return false;
    
}
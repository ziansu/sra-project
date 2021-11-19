public java.lang.String getFileName() {
    java.lang.String fileName = url.getFile();
    return fileName.substring(fileName.lastIndexOf('/'));
}
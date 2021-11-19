private java.lang.String getFileDirectoryFromProperties(java.util.Properties storageProperties, java.lang.String key) {
    java.lang.String fileDir = storageProperties.getProperty(key);
    fileDir = getFileDirectory(fileDir);
    return fileDir;
}
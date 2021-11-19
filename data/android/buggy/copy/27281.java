public java.lang.String prepareStorage(java.lang.String fileName) {
    java.lang.String filePath = setFilePath(fileName);
    storageIO = new StorageIO(filePath);
    storageIO.getDataFromFile(tasks);
    return java.lang.String.format(Constants.MESSAGE_WELCOME, filePath);
}
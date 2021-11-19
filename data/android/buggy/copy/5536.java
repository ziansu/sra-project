public byte[] readFile(java.lang.String fileName) {
    fatHandler.stopCaching();
    byte[] data = fatHandler.readFile(fileName);
    fatHandler.continueCaching();
    return data;
}
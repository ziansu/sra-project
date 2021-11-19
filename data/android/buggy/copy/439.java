public boolean changeDir(java.lang.String dirName) {
    fatHandler.stopCaching();
    boolean result = fatHandler.changeDir(dirName);
    fatHandler.continueCaching();
    return result;
}
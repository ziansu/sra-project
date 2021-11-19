public boolean changeDirBack() {
    fatHandler.stopCaching();
    boolean result = fatHandler.changeDirBack();
    fatHandler.continueCaching();
    return result;
}
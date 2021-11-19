public boolean checkLowDiskSpace() {
    final java.io.File storageDir = new java.io.File(storagePath);
    final long freeSpace = storageDir.getFreeSpace();
    if (freeSpace < 0)
        return true;
    
    return freeSpace < (freeSpaceLimit);
}
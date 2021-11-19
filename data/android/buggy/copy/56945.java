private boolean checkDiskSpace() {
    final long space = org.exist.util.FileUtils.measureFileStore(dataDir, java.nio.file.FileStore::getUsableSpace);
    return space > (diskSpaceMin);
}
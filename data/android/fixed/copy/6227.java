private void moveToNextQueue(java.nio.file.Path file) throws java.lang.InterruptedException {
    directoryQueue.put(file);
    ru.shishmakov.core.DirectoryFileWatcher.logger.info("--> put file \'{}\' : directoryQueue", file.getFileName());
}
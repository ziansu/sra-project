private boolean isQueueStillFilled() {
    return (scanInProgress.get()) || ((filesToHashQueue.size()) > 0);
}
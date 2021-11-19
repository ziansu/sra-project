private void startBackgroundCompactTask() {
    if ((this.compactWorker) != null) {
        this.compactWorker.start();
    }
}
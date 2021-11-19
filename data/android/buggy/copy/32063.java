public void stop() {
    this.inotifyFile.delete();
    this.fetchAndApplyFuture.cancel(false);
}
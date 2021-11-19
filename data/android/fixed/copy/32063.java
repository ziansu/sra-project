public void stop() {
    this.inotifyFile.delete();
    if ((this.fetchAndApplyFuture) != null) {
        this.fetchAndApplyFuture.cancel(false);
    }
}
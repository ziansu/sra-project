void close() {
    if ((this.executorService) != null) {
        this.executorService.shutdownNow();
    }
    this.removeAllClusterNodes();
}
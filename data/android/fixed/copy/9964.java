public void terminate() {
    if ((this.schemaPosition) != null) {
        this.schemaPosition.stop();
    }
    this.connectionPool.release();
}
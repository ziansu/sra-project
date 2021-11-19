public void terminate() {
    if ((this.schemaPosition) != null) {
        this.schemaPosition.stop();
        this.schemaPosition = null;
    }
    this.connectionPool.release();
}
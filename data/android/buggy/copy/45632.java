public void close() {
    this.localConnection.close();
    this.database.close();
}
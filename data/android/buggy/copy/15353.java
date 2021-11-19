private void cleanup() {
    try {
        this.table.close();
        this.conn.close();
    } catch (java.io.IOException ignore) {
    }
}
@java.lang.Override
protected void finalize() throws java.lang.Throwable {
    try {
        super.finalize();
    } finally {
        if ((this.connection) != null) {
            this.connection.close();
        }
    }
}
java.util.List<com.squareup.okhttp.Connection> getConnections() {
    synchronized(this) {
        return new java.util.ArrayList(connections);
    }
}
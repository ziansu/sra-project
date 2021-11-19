public synchronized boolean connect(java.lang.String hostname, int port, java.lang.String database, java.lang.String username, java.lang.String password) throws java.lang.Exception {
    return connect(hostname, port, database, username, password, false);
}
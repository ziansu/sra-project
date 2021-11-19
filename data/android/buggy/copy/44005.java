private javax.management.MBeanServerConnection getConnection() throws java.io.IOException {
    if ((connection) == null) {
        newConnection();
    }
    return connection;
}
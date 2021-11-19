public boolean checkConnection() throws java.sql.SQLException {
    return ((this.connection) != null) && (!(this.connection.isClosed()));
}
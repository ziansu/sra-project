public boolean closeConnection() throws java.sql.SQLException {
    if ((connection) == null) {
        return false;
    }
    connection.close();
    return true;
}
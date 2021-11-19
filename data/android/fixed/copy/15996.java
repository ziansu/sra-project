public boolean close() {
    try {
        statement.close();
        connection.close();
        return true;
    } catch (java.sql.SQLException e) {
        printSQLException(e);
    }
    return false;
}
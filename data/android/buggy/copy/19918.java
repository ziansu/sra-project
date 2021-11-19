public static boolean closeConnection(java.sql.Connection connection) {
    try {
        connection.close();
    } catch (java.sql.SQLException e) {
        return false;
    }
    return true;
}
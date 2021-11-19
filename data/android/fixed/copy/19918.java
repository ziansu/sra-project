public static boolean closeConnection(java.sql.Connection connection) {
    if (connection == null)
        return false;
    
    try {
        connection.close();
    } catch (java.sql.SQLException e) {
        return false;
    }
    return true;
}
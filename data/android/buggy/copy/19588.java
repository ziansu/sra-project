private void safeClose() {
    try {
        if ((connection) != null) {
            connection.close();
            connection = null;
        }
    } catch (java.sql.SQLException e) {
    }
}
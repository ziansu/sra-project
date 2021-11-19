public void closeConnection() {
    try {
        conn.close();
    } catch (java.sql.SQLException e) {
    }
}
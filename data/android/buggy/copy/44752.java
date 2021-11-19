private void closeConnection() {
    try {
        conn.close();
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println(e);
    }
}
public void startConnection() {
    myConnection = null;
    try {
        myConnection = java.sql.DriverManager.getConnection(SQLConnection.SQL_URL);
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("Error connecting");
        e.printStackTrace();
    }
}
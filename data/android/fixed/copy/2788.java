public void openConnection() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.Class.forName(driverClass);
    conn = java.sql.DriverManager.getConnection(url, userName, password);
}
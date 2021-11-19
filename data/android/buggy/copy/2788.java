public void openConnection(java.lang.String driverClass, java.lang.String url, java.lang.String userName, java.lang.String password) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.Class.forName(driverClass);
    conn = ((java.sql.Connection) (java.sql.DriverManager.getConnection(url, userName, password)));
}
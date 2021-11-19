public static java.sql.Connection openConnection(java.lang.String connString) throws java.sql.SQLException {
    java.sql.Connection conn = java.sql.DriverManager.getConnection(connString);
    return conn;
}
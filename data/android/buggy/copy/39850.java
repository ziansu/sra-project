public static java.sql.Connection getMySQLConnection() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.String hostName = "localhost";
    java.lang.String dbName = "mysql";
    java.lang.String userName = "root";
    java.lang.String password = "root";
    return com.database.MySQLConnUtils.getMySQLConnection(hostName, dbName, userName, password);
}
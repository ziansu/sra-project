private java.sql.Connection getConnection() throws java.sql.SQLException {
    if ((conn) == null)
        conn = java.sql.DriverManager.getConnection(dbaware.DbConnector.db_connect_string, dbaware.DbConnector.db_userid, dbaware.DbConnector.db_password);
    
    return conn;
}
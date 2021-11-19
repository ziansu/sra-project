private void open() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    persistence.DBConnection dbconnection = new persistence.DBConnection();
    connect = dbconnection.getConnection();
}
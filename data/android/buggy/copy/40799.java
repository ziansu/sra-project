public synchronized java.sql.ResultSet returnQuery(java.lang.String sql) throws java.sql.SQLException {
    java.sql.Statement s = conn.createStatement();
    s.executeQuery(sql);
    return s.getResultSet();
}
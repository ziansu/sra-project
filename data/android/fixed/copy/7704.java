public void query(java.sql.Connection connection, java.lang.String query) throws java.sql.SQLException {
    java.lang.System.out.println(query);
    java.sql.Statement stmt = connection.createStatement();
    stmt.execute(query);
}
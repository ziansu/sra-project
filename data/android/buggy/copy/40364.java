public void executeUpdate(java.lang.String request) throws java.lang.Exception {
    java.sql.Statement stmt = connection.createStatement();
    stmt.closeOnCompletion();
    stmt.executeUpdate(request);
}
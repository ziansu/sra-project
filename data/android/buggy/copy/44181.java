public java.sql.ResultSet doQuery(java.lang.String query) throws java.sql.SQLException {
    java.sql.PreparedStatement stmt = con.prepareStatement(query);
    return stmt.executeQuery(query);
}
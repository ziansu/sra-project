void commitAndCloseAll(java.sql.PreparedStatement ps, java.sql.ResultSet resultSet) throws java.sql.SQLException {
    ps.close();
    resultSet.close();
    con.commit();
}
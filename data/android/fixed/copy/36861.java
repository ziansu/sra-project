void commitAndCloseAll(java.sql.PreparedStatement ps, java.sql.ResultSet resultSet) throws java.sql.SQLException {
    if (ps != null) {
        ps.close();
    }
    if (resultSet != null) {
        resultSet.close();
    }
    con.commit();
}
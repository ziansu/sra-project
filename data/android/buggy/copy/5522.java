public java.sql.ResultSet queryData(java.lang.String sql) {
    java.sql.ResultSet resultSet = null;
    try {
        resultSet = statement.executeQuery(sql);
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("SQL Error");
    } finally {
        close();
    }
    return resultSet;
}
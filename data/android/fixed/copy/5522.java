public void queryData(java.lang.String sql) {
    try {
        resultSet = statement.executeQuery(sql);
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("SQL Error");
    }
}
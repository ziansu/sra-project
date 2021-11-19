private void closeAll(java.sql.Connection connection, java.sql.ResultSet resultSet, java.sql.PreparedStatement... statements) throws java.sql.SQLException {
    resultSet.close();
    closeAll(connection, statements);
}
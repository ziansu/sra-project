private void closeAll(boolean commit, java.sql.Connection connection, java.sql.ResultSet resultSet, java.sql.PreparedStatement... statements) throws java.sql.SQLException {
    resultSet.close();
    closeAll(commit, connection, statements);
}
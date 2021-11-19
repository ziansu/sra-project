public static java.sql.PreparedStatement create(java.sql.Connection connection, java.lang.String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws java.sql.SQLException {
    java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
    return jodd.db.debug.LoggablePreparedStatementFactory.wrap(preparedStatement, sql);
}
protected java.sql.PreparedStatement createPreparedStatement(java.sql.Connection connection, java.lang.String sql, java.lang.Object... args) {
    return createPreparedStatement(connection, sql, args, (-1));
}
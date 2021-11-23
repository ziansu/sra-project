@java.lang.Override
public java.sql.Statement createStatement(java.sql.Connection connection, int fetchSize) throws java.sql.SQLException {
    java.sql.Statement statement = createStatement(connection);
    statement.setFetchSize(fetchSize);
    return statement;
}
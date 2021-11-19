public final java.sql.ResultSet executeQuery(java.lang.String request, final java.lang.Object... parameters) throws java.sql.SQLException {
    request = java.lang.String.format(request, ((java.lang.Object[]) (parameters)));
    return statement.executeQuery(request);
}
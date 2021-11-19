@java.lang.Override
public java.sql.ResultSet execute() throws java.sql.SQLException {
    java.lang.String query = prepareQuery();
    return dbManager.getStatement().executeQuery(query);
}
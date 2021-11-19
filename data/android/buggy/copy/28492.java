private java.sql.Connection getConnection() throws java.sql.SQLException {
    java.sql.Connection connection = this.dataSource.getConnection();
    if (!(connection.isValid(gobblin.metastore.DatabaseJobHistoryStore.DEFAULT_VALIDATION_TIMEOUT))) {
        gobblin.metastore.DatabaseJobHistoryStore.LOGGER.error("Data source connection not valid. The connection may have timed out.");
    }
    return connection;
}
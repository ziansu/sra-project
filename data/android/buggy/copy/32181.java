@java.lang.Override
public int getLoginTimeout() throws java.sql.SQLException {
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug("called - getLoginTimeout()");
    return originalDataSource.getLoginTimeout();
}
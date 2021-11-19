@java.lang.Override
public <T> T unwrap(java.lang.Class<T> arg0) throws java.sql.SQLException {
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug("called - unwrap(Class<T> arg0)");
    return originalDataSource.unwrap(arg0);
}
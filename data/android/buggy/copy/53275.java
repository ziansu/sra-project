@java.lang.Override
public void setLoginTimeout(int arg0) throws java.sql.SQLException {
    org.eclipse.dirigible.repository.datasource.WrappedDataSource.logger.debug("called - setLoginTimeout(int arg0)");
    originalDataSource.setLoginTimeout(arg0);
}
public javax.sql.DataSource getDataSource(java.lang.String dataSourceName) throws javax.naming.NamingException {
    if ((org.wso2.carbon.security.usercore.util.DatabaseUtil.initialContext) == null) {
        throw new java.lang.RuntimeException("Context is null. Cannot retrieve data source");
    }
    return null;
}
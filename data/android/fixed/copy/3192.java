@java.lang.Override
protected void finalize() throws java.lang.Throwable {
    org.wso2.carbon.analytics.datasource.rdbms.RDBMSUtils.cleanupConnection(this.rs, this.stmt, this.conn);
    super.finalize();
}
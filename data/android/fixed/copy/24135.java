public void executeSyncQuery(java.lang.String sql) {
    if ((xdDriver) == null) {
        xdDriver = new com.stratio.crossdata.driver.JavaDriver();
    }
    result = xdDriver.syncQuery(new com.stratio.crossdata.common.SQLCommand(sql, java.util.UUID.randomUUID(), false));
}
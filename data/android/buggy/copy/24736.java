private long createIndexProcessId(int tenantId, java.lang.String tableName, int shardId) {
    java.lang.String tableId = org.wso2.carbon.analytics.datasource.core.util.GenericUtils.calculateTableIdentity(tenantId, tableName);
    return (tableId.hashCode()) + shardId;
}
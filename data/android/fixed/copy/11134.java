private long toTSTableTimestamp(long timestamp, java.lang.String id) {
    return (timestamp * (org.wso2.carbon.analytics.datasource.cassandra.CassandraAnalyticsRecordStore.TS_MULTIPLIER)) + ((long) ((java.lang.Math.random()) * (org.wso2.carbon.analytics.datasource.cassandra.CassandraAnalyticsRecordStore.TS_MULTIPLIER)));
}
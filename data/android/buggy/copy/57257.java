public void log(org.apache.cassandra.utils.NoSpamLogger.Level l, java.lang.String s, long nowNanos, java.lang.Object... objects) {
    getStatement(s, minIntervalNanos).log(l, nowNanos, objects);
}
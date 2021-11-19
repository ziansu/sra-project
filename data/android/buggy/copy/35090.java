public void error(long nowNanos, java.lang.String s, java.lang.Object... objects) {
    log(org.apache.cassandra.utils.NoSpamLogger.Level.ERROR, s, nowNanos, objects);
}
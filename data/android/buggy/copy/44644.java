public void warn(long nowNanos, java.lang.String s, java.lang.Object... objects) {
    log(org.apache.cassandra.utils.NoSpamLogger.Level.WARN, s, nowNanos, objects);
}
public boolean warn(long nowNanos, java.lang.Object... objects) {
    return this.log(org.apache.cassandra.utils.NoSpamLogger.Level.WARN, nowNanos, objects);
}
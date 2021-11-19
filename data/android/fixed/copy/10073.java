public boolean error(long nowNanos, java.lang.Object... objects) {
    return this.log(org.apache.cassandra.utils.NoSpamLogger.Level.ERROR, nowNanos, objects);
}
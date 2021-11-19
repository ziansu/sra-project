public boolean error(long nowNanos, java.lang.String s, java.lang.Object... objects) {
    return this.log(org.apache.cassandra.utils.NoSpamLogger.Level.ERROR, s, nowNanos, objects);
}
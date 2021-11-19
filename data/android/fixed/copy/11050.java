public void info(long nowNanos, java.lang.String s, java.lang.Object... objects) {
    this.log(org.apache.cassandra.utils.NoSpamLogger.Level.INFO, s, nowNanos, objects);
}
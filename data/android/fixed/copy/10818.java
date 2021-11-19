public boolean warn(java.lang.String s, java.lang.Object... objects) {
    return this.warn(org.apache.cassandra.utils.NoSpamLogger.CLOCK.nanoTime(), s, objects);
}
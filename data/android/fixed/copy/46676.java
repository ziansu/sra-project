public boolean warn(java.lang.Object... objects) {
    return this.warn(org.apache.cassandra.utils.NoSpamLogger.CLOCK.nanoTime(), objects);
}
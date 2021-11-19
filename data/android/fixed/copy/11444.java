public void error(java.lang.String s, java.lang.Object... objects) {
    this.error(org.apache.cassandra.utils.NoSpamLogger.CLOCK.nanoTime(), s, objects);
}
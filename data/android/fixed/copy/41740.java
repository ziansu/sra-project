public void setTimeFormat(final java.lang.String pattern) throws java.lang.IllegalArgumentException {
    synchronized(buffer) {
        timeFormat(pattern);
    }
}
public void debug(java.lang.String msg) {
    if (debug) {
        delegate.getLogger().println(msg);
    }
}
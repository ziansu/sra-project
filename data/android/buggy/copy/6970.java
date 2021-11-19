public java.io.PrintWriter debug(java.lang.String msg) {
    java.io.PrintStream logger = delegate.getLogger();
    if (debug) {
        logger.println(msg);
    }
    return new java.io.PrintWriter(logger);
}
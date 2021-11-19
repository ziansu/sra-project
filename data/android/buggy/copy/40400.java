public java.io.PrintWriter debug(java.lang.String format, java.lang.Object... args) {
    java.io.PrintStream logger = delegate.getLogger();
    if (debug) {
        logger.println(java.lang.String.format(format, args));
    }
    return new java.io.PrintWriter(logger);
}
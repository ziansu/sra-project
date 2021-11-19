public java.io.PrintWriter info(java.lang.String format, java.lang.Object... args) {
    java.io.PrintStream logger = delegate.getLogger();
    logger.println(java.lang.String.format(format, args));
    return new java.io.PrintWriter(logger);
}
static java.lang.String toString(java.lang.Exception e) {
    java.util.Objects.requireNonNull(e);
    java.io.StringWriter sw = new java.io.StringWriter();
    e.printStackTrace(new java.io.PrintWriter(sw));
    return sw.toString();
}
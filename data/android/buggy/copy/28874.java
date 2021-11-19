static java.lang.String toString(java.lang.Exception e) {
    java.io.StringWriter sw = new java.io.StringWriter();
    java.util.Objects.requireNonNull(e).printStackTrace(new java.io.PrintWriter(sw));
    return sw.toString();
}
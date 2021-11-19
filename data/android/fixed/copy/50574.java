public static java.lang.String stackTrace(java.lang.Exception ex) {
    java.io.Writer writer = new java.io.StringWriter();
    java.io.PrintWriter printWriter = new java.io.PrintWriter(writer);
    ex.printStackTrace(printWriter);
    return writer.toString();
}
public void printErrorsAndCount(java.io.Writer out) throws java.io.IOException {
    int count = printErrors(out);
    out.write(java.lang.String.format("%d %s.%n", count, (count == 1 ? "error" : "errors")));
}
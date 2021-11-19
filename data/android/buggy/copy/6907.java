public com.google.googlejavaformat.FormatterDiagnostic diagnostic(java.lang.String message) {
    java.lang.System.err.printf(">>>> %d: %s\n", inputPosition, message);
    return input.createDiagnostic(inputPosition, message);
}
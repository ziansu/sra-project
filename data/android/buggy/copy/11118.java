private java.lang.String formatUnexpected(java.lang.String field, java.lang.Object actual) {
    return ((field + "\nUnexpected: ") + (org.skyscreamer.jsonassert.JSONCompareResult.describe(value))) + "\n";
}
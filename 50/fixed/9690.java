private java.lang.String escapeString(java.lang.String str) {
    return str.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r");
}
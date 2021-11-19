private java.lang.StringBuilder buildCodeLines(java.util.List<java.lang.String> lines) {
    java.lang.StringBuilder codes = new java.lang.StringBuilder();
    for (java.lang.String line : lines) {
        codes.append(br).append(line);
    }
    return codes;
}
private java.lang.String refact(java.lang.String line) {
    java.lang.String refactoredLine = line.replaceAll(",", ".").replaceAll(" ", "").toUpperCase();
    return process(refactoredLine);
}
private java.lang.String refact(java.lang.String line) {
    return process(line.replaceAll(",", ".").replaceAll(" ", "").toUpperCase());
}
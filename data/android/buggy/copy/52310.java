private java.lang.String getValue(java.lang.String line) {
    int pos = line.indexOf(":");
    return line.substring(pos);
}
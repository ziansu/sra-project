private java.lang.String getProblemName(java.lang.String line) {
    int fileNameStartIndex = (line.indexOf(":")) + 1;
    java.lang.String problemFileName = line.substring(fileNameStartIndex);
    return problemFileName;
}
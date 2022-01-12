public java.lang.String[] getStringArray(java.io.BufferedReader bufferedReader) {
    java.lang.String str = getLine(bufferedReader);
    java.lang.String[] splittedLine = str.split(" ");
    return splittedLine;
}
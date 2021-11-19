public int getLineNumber() {
    if ((lineNumber) > 0) {
        return lineNumber;
    }else {
        throw new java.lang.IllegalArgumentException((("Number of lines of the file " + (name)) + " was not initialized"));
    }
}
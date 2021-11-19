private void intTopError(java.lang.String expected, java.lang.String received, int lineNum) {
    java.lang.String error = (((("ERROR: [Line : " + lineNum) + "] Incompatibile types. Expected: ") + expected) + " Received:  ") + received;
    this.errorMessages.add(error);
}
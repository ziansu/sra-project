private void printErrorMessage(java.lang.String message, int underlineLength) {
    java.lang.System.err.println(mCommand);
    printUnderLine(getPosition(mIndex), underlineLength);
    java.lang.System.err.println(message);
}
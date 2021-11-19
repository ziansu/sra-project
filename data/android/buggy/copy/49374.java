private void printErrorMessage(java.lang.String message) {
    java.lang.System.out.println(mCommand);
    int underlineLength = (mTokenEnded) ? 3 : mTokens.get(mIndex).length();
    printUnderLine(getPosition(mIndex), underlineLength);
    java.lang.System.out.println(message);
}
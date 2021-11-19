private boolean mustMatchToken(int toMatch, java.lang.String msgId, int pos, int len, boolean lookAhead) throws java.io.IOException {
    if (matchToken(toMatch, lookAhead)) {
        return true;
    }
    reportError(msgId, pos, len);
    return false;
}
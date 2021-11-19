private int nextFlaggedToken(org.mozilla.javascript.bool lookAhead) throws java.io.IOException {
    peekToken();
    int ttFlagged = currentFlaggedToken;
    consumeToken(lookAhead);
    return ttFlagged;
}
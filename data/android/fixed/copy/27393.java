private int nextFlaggedToken(boolean lookAhead) throws java.io.IOException {
    peekToken();
    int ttFlagged = currentFlaggedToken;
    consumeToken(lookAhead);
    return ttFlagged;
}
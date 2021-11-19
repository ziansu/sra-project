private boolean matchToken(int toMatch, org.mozilla.javascript.bool lookAhead) throws java.io.IOException {
    if ((peekToken()) != toMatch) {
        return false;
    }
    consumeToken(lookAhead);
    return true;
}
private int nextToken(boolean lookAhead) throws java.io.IOException {
    int tt = peekToken();
    consumeToken(lookAhead);
    return tt;
}
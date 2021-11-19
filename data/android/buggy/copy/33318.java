public mondo.token.Token hardReset() {
    finished = false;
    hardTokenIndex = 0;
    tokenIndex = hardTokenIndex;
    return tokens.get(tokenIndex);
}
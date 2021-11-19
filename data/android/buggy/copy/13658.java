protected void nextGreater() {
    source.nextChar();
    if ((source.getChar()) == '=') {
        token = greaterEqualToken;
        source.nextChar();
    }else {
        token = greaterToken;
    }
}
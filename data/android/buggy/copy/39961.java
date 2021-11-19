private char peek() {
    if (((pos) + 1) >= (chars.length)) {
        return 0;
    }
    return chars[((pos) + 1)];
}
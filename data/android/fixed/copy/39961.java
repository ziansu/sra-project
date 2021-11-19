private char peek() {
    return ((pos) + 1) >= (chars.length) ? 0 : chars[((pos) + 1)];
}
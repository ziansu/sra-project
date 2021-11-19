private static int charToInt(char ch) {
    return (0 <= ch) && (ch <= '9') ? ch - '0' : (ch - 'A') + 10;
}
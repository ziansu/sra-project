private static boolean isChar(byte b) {
    return !(((b < 'A') || ((b > 'Z') && (b < 'a'))) || (b > 'z'));
}
public static java.lang.String replaceCharAt(java.lang.String s, char c, int pos) {
    return ((s.substring(0, pos)) + c) + (s.substring((pos + 1)));
}
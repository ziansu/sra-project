protected int readEight(java.nio.CharBuffer buffer) {
    return java.lang.Integer.parseInt(readChars(buffer, 8).toString(), 16);
}
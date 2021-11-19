private static boolean verifyChecksum(byte[] b, int length) {
    byte c = 0;
    for (int i = 0; i < length; i++) {
        c ^= b[i];
    }
    return c == 0;
}
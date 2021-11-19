private static boolean verifyChecksum(byte[] b) {
    byte c = 0;
    for (byte b2 : b) {
        c ^= b2;
    }
    return c == 0;
}
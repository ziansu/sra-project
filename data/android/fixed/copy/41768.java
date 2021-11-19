public static boolean getBit(byte bits, int i) {
    return ((bits >> i) & 1) == 1;
}
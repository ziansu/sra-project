public static int computeDigitalRoot(int n) {
    return n == 0 ? 0 : n == 9 ? 9 : n % 9;
}
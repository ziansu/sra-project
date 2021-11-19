private static long sumMultiple(int n, int max) {
    int k = (max - 1) / n;
    return ((n * k) * (k + 1)) / 2;
}
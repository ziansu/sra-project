public long uniquePathsTD(int m, int n) {
    final long[][] memo = new long[m][n];
    return paths(0, 0, m, n, memo);
}
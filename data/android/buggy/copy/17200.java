public long getTriangleNumber(int n) {
    long triNum = 0;
    for (int i = 1; i <= n; i++) {
        triNum += i;
    }
    return triNum;
}
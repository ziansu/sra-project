private int fibHelper(int i, int j, int n) {
    if (n == 2) {
        return i;
    }
    return fibHelper(j, (i + j), (n - 1));
}
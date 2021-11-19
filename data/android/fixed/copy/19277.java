public int backtrack(int[] x) {
    for (int i = 0; i < 10; i++) {
        for (int y : x) {
            minimax(y);
        }
    }
    return 0;
}
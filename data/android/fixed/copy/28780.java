public static int roundDown(int a, int b) {
    if (b == 0) {
        return 0;
    }
    return (a / b) * b;
}
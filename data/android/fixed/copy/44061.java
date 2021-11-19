private static int ab(int a) {
    int b = a >> 8;
    return (a ^ b) - b;
}
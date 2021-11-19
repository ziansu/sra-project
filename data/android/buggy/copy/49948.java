public static int gcd(int a, int b) {
    return b == a ? a : BacktrackingAlgorithms.gcd(b, (a % b));
}
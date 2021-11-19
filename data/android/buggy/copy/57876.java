static long gcd(long a, long b) {
    return b == 0 ? a : GCD.gcd(b, (a % b));
}
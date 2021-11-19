static long gcd(long a, long b) {
    return b == 0 ? a < 0 ? -a : a : GCD.gcd(b, (a % b));
}
private static int gcd(int a, int b) {
    return java.math.BigInteger.valueOf(a).gcd(java.math.BigInteger.valueOf(b)).intValue();
}
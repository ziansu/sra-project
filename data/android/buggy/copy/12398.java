public static java.math.BigInteger fac(int n) {
    java.math.BigInteger fac = java.math.BigInteger.ONE;
    for (int i = 1; i <= n; i++) {
        fac = fac.multiply(fac.add(java.math.BigInteger.ONE));
    }
    return fac;
}
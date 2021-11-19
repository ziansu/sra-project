protected static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return qcv1.ShorsAlgorithm.gcd(b, (a % b));
}
static boolean isNegativeZero(double x) {
    return (x == 0.0) && ((java.lang.Math.copySign(1, x)) == (-1.0));
}
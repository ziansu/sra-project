public static double sqrt(double n) {
    if (n <= 0) {
        throw new java.lang.IllegalArgumentException("You cannot take a square root of a negative number!");
    }
    return Recursion.sqrtHelper(n, 1.0);
}
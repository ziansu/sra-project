public static double sqrt(double n) {
    if (n < 0) {
        throw new java.lang.IllegalArgumentException("The input is negative.");
    }
    return Recursion.betterGuess(n, 1);
}
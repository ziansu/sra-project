public static double sqrt(double n) {
    if (n < 0)
        throw new java.lang.IllegalArgumentException();
    else
        if (n == 0)
            return 0;
        else {
            return Recursion.rHelper(n, 1);
        }
    
}
public long getNumDivisors(long n) {
    int numDivisors = 0;
    for (long i = 1; i <= n; i++) {
        if ((n % i) == 0) {
            numDivisors++;
        }
    }
    return numDivisors;
}
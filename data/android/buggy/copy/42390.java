private static boolean isPrime(long i) {
    for (long prime : problems.problem3.Problem3.primes) {
        if ((i % prime) == 0) {
            return false;
        }
    }
    return true;
}
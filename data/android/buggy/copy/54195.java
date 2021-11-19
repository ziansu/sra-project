public int getNextPrimeNumber(java.util.List<java.lang.Integer> primeNumbers, int lastPrime) {
    int nextPrime = lastPrime + 1;
    while (!(isAPrime(primeNumbers, nextPrime))) {
        nextPrime++;
    } 
    return nextPrime;
}
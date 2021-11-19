public static int getNextPrime(int num) {
    int result = num;
    while (!(MathUtils.isPrime(result))) {
        result++;
    } 
    return result;
}
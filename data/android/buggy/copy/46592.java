public static int generateRandomOdd() {
    java.util.Random randomGenerator = new java.util.Random();
    int result = randomGenerator.nextInt();
    if ((result % 2) != 1) {
        result++;
    }
    return result;
}